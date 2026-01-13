package com.terra.app;

////File: CompareSeriesToCentralConsole.java
//File: TwoCsvContainmentExact.java
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Ensures that every data row in LEFT_FILE exists in RIGHT_FILE with the exact
 * same number of columns and the same column order.
 *
 * Requirements: - First line is header in both files. - Headers must match
 * exactly (same count, same order, same names). - Data rows are compared as
 * complete tuples in header order. - Duplicate rows are honored (multiset
 * containment). - Outputs missing rows (with counts) and a summary to console.
 *
 * Configure LEFT_FILE and RIGHT_FILE below.
 */
public class TwoCsvContainmentExact {
	// --- Configure here ---
	private static final String LEFT_FILE = "C:\\Test/series FRK.csv"; // e.g., "series_imt.csv"
	private static final String RIGHT_FILE = "C:\\Test/series IT.csv"; // e.g.,
																									// "series_central.csv"
	private static final boolean TRIM_FIELDS = false; // trim whitespace in fields before comparing
	private static final boolean CASE_INSENSITIVE = false; // compare case-insensitively if true

	public static void main(String[] args) {
		try {
			CsvData left = readCsv(Paths.get(LEFT_FILE));
			CsvData right = readCsv(Paths.get(RIGHT_FILE));
			// Validate headers: exact match required (same size, same order, same names)
			if (!headersEqual(left.headers, right.headers)) {
				throw new IllegalArgumentException("Headers do not match exactly.\n" + "Left  headers: " + left.headers
						+ "\n" + "Right headers: " + right.headers);
			}
			// Build multiset (counts) of normalized rows for RIGHT
			Map<String, Integer> rightCounts = new LinkedHashMap<>();
			for (Map<String, String> row : right.rows) {
				String key = canonicalRow(row, right.headers);
				rightCounts.put(key, rightCounts.getOrDefault(key, 0) + 1);
			}
			int totalLeftRows = left.rows.size();
			int satisfied = 0;
			int missing = 0;
			System.out.println("status,count,row");
			// For each LEFT row, check availability in RIGHT multiset
			Map<String, Integer> missingRows = new LinkedHashMap<>();
			for (Map<String, String> row : left.rows) {
				String key = canonicalRow(row, left.headers);
				Integer c = rightCounts.get(key);
				if (c != null && c > 0) {
					rightCounts.put(key, c - 1);
					satisfied++;
				} else {
					missing++;
					missingRows.put(key, missingRows.getOrDefault(key, 0) + 1);
				}
			}
			// Print each missing row (with count)
			for (Map.Entry<String, Integer> e : missingRows.entrySet()) {
				System.out.println("MISSING," + e.getValue() + "," + csvQuote(e.getKey()));
			}
			// Summary
			System.out.println();
			System.out.println("# Summary");
			System.out.println("# Left total rows," + totalLeftRows);
			System.out.println("# Satisfied in right," + satisfied);
			System.out.println("# Missing in right," + missing);
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace(System.err);
			System.exit(1);
		}
	}

	// --- CSV structures ---
	static class CsvData {
		final List<String> headers;
		final List<Map<String, String>> rows;

		CsvData(List<String> headers, List<Map<String, String>> rows) {
			this.headers = headers;
			this.rows = rows;
		}
	}

	// --- CSV reading with quoted field support ---
	static CsvData readCsv(Path file) throws IOException {
		if (!Files.exists(file))
			throw new FileNotFoundException("Not found: " + file.toAbsolutePath());
		List<String> headers = null;
		List<Map<String, String>> rows = new ArrayList<>();
		try (BufferedReader br = Files.newBufferedReader(file)) {
			String line;
			while ((line = br.readLine()) != null) {
				List<String> fields = parseCsvLine(line);
				if (fields.isEmpty())
					continue;
				if (headers == null) {
					headers = fields;
				} else {
					if (fields.size() != headers.size()) {
						throw new IllegalArgumentException("Row has different column count than header in file: "
								+ file.toAbsolutePath() + "\nRow: " + fields + "\nHeader: " + headers);
					}
					Map<String, String> row = new LinkedHashMap<>();
					for (int i = 0; i < headers.size(); i++) {
						String h = headers.get(i);
						String v = fields.get(i);
						row.put(h, v);
					}
					rows.add(row);
				}
			}
		}
		if (headers == null)
			headers = Collections.emptyList();
		return new CsvData(headers, rows);
	}

	static List<String> parseCsvLine(String line) {
		List<String> fields = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		boolean inQuotes = false;
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			if (ch == '\"') {
				if (inQuotes && i + 1 < line.length() && line.charAt(i + 1) == '\"') {
					sb.append('\"');
					i++; // escaped quote
				} else {
					inQuotes = !inQuotes;
				}
			} else if (ch == ',' && !inQuotes) {
				fields.add(processField(sb.toString()));
				sb.setLength(0);
			} else {
				sb.append(ch);
			}
		}
		fields.add(processField(sb.toString()));
		return fields;
	}

	static String processField(String s) {
		String v = TRIM_FIELDS ? s.trim() : s;
		return CASE_INSENSITIVE ? v.toLowerCase(Locale.ROOT) : v;
	}

	// --- Exact header equality ---
	static boolean headersEqual(List<String> a, List<String> b) {
		if (a.size() != b.size())
			return false;
		for (int i = 0; i < a.size(); i++) {
			String aa = TRIM_FIELDS ? a.get(i).trim() : a.get(i);
			String bb = TRIM_FIELDS ? b.get(i).trim() : b.get(i);
			if (CASE_INSENSITIVE) {
				if (!aa.equalsIgnoreCase(bb))
					return false;
			} else {
				if (!aa.equals(bb))
					return false;
			}
		}
		return true;
	}

	// --- Canonical row string using exact column order and count ---
	static String canonicalRow(Map<String, String> row, List<String> headers) {
		StringBuilder sb = new StringBuilder();
		char sep = ','; // use comma; we will quote the entire string for output
		for (int i = 0; i < headers.size(); i++) {
			String h = headers.get(i);
			String v = row.getOrDefault(h, "");
			// Preserve exact field as parsed (after trim/case options already applied)
			sb.append(v);
			if (i < headers.size() - 1)
				sb.append(sep);
		}
		return sb.toString();
	}

	static String csvQuote(String s) {
		String val = s.replace("\"", "\"\"");
		return "\"" + val + "\"";
	}
}
