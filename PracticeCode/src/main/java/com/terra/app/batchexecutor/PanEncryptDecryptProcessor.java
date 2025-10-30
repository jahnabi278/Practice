package com.terra.app.batchexecutor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PanEncryptDecryptProcessor {

	private static final String SELECT_QUERY = "SELECT id, pan_number FROM pan_table LIMIT ? OFFSET ?";
	private static final String UPDATE_QUERY = "UPDATE pan_table SET pan_number = ? WHERE id = ?";
	private static final int BATCH_SIZE = 5000;

	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection("jdbc:postgresql://host/db", "user", "pass")) {
			conn.setAutoCommit(false);

			int offset = 0;
			while (true) {
				List<PanRecord> records = fetchBatch(conn, offset);
				if (records.isEmpty())
					break;

				// Encrypt PAN numbers
				for (PanRecord record : records) {
					record.setPanNumber(encrypt(record.getPanNumber()));
				}

				// Bulk update
				updateBatch(conn, records);
				conn.commit();

				offset += BATCH_SIZE;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static List<PanRecord> fetchBatch(Connection conn, int offset) throws SQLException {
		List<PanRecord> records = new ArrayList<>();
		try (PreparedStatement ps = conn.prepareStatement(SELECT_QUERY)) {
			ps.setInt(1, BATCH_SIZE);
			ps.setInt(2, offset);
			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					records.add(new PanRecord(rs.getInt("id"), rs.getString("pan_number")));
				}
			}
		}
		return records;
	}

	private static void updateBatch(Connection conn, List<PanRecord> records) throws SQLException {
		try (PreparedStatement ps = conn.prepareStatement(UPDATE_QUERY)) {
			for (PanRecord record : records) {
				ps.setString(1, record.getPanNumber());
				ps.setInt(2, record.getId());
				ps.addBatch();
			}
			ps.executeBatch();
		}
	}

	private static String encrypt(String pan) {
		// Implement AES encryption here
		return "encrypted_" + pan;
	}

	static class PanRecord {
		private int id;
		private String panNumber;

		public PanRecord(int id, String panNumber) {
			this.id = id;
			this.panNumber = panNumber;
		}

		public int getId() {
			return id;
		}

		public String getPanNumber() {
			return panNumber;
		}

		public void setPanNumber(String panNumber) {
			this.panNumber = panNumber;
		}
	}
}