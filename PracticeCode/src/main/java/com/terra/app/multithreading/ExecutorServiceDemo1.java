package com.terra.app.multithreading;

import java.util.concurrent.Callable;

public class ExecutorServiceDemo1 {

	public static void main(String[] args) throws Exception {
		// Runnable - doesn't return a value
		// Callable - returns a value also can throw checked exception

		Callable<Integer> task = () -> {
			System.out.println("Callable : ");
			Thread.sleep(1000);
			return 1;
		};
		//System.out.println(task.call());

	}

}
