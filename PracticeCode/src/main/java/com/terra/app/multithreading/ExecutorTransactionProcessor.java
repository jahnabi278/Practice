package com.terra.app.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorTransactionProcessor {

	private static final int TOTAL_TRANSACTIONS = 1000000;
	private static final int THREAD_POOL_SIZE = 10;
	private static final int CHUNK_SIZE = TOTAL_TRANSACTIONS / THREAD_POOL_SIZE; // Number of transactions per thread

	public static void main(String[] args) throws InterruptedException {
		// Simulate 1 million transactions
		List<String> transactions = new ArrayList<>();
		for (int i = 0; i < TOTAL_TRANSACTIONS; i++) {
			transactions.add("Transaction-" + i);
		}

		// Create a fixed thread pool
		ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

		// Divide transactions into chunks and submit tasks
		List<Future<?>> futures = new ArrayList<>();
		for (int i = 0; i < transactions.size(); i += CHUNK_SIZE) {
			int start = i;
			int end = Math.min(i + CHUNK_SIZE, transactions.size());
			List<String> chunk = transactions.subList(start, end);

			futures.add(executorService.submit(() -> {
				processTransaction(chunk);
			}));
		}

		// Wait for all tasks to complete
		for (Future<?> future : futures) {
			try {
				future.get(); // Wait for task to complete
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}

		// Shutdown the executor
		executorService.shutdown();
		System.out.println("All transactions processed.");
	}

	private static void processTransaction(List<String> transactions) {
		for (String txn : transactions) {
			// Simulate processing
			// System.out.println("Processing: " + txn);
		}
	}

}
