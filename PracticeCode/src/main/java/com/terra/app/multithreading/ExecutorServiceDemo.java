package com.terra.app.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		/**
		 * Creates a pool with a fixed number of threads. Good for limiting concurrency.
		 */

		ExecutorService executor = Executors.newFixedThreadPool(10);
		System.out.println("Using newFixedThreadPool : " + executor.getClass());
		/**
		 * Creates threads as needed and reuses idle ones. Suitable for short-lived
		 * asynchronous tasks.
		 */
		ExecutorService executor1 = Executors.newCachedThreadPool();
		System.out.println("newCachedThreadPool - " + executor1.getClass());
		/**
		 * Executes tasks sequentially in a single thread. Useful for tasks that must
		 * not run concurrently
		 */
		ExecutorService executor2 = Executors.newSingleThreadExecutor();
		System.out.println("newSingleThreadExecutor -" + executor2.getClass());

	}

}
