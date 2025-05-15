package com.example.demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
	private final Lock lock = new ReentrantLock();

	public void doWork() {
		lock.lock();
		try {
			// Critical section of code
			System.out.println("Thread " + Thread.currentThread().getName() + " is working.");
		} finally {
			lock.unlock(); // Ensure the lock is released
		}
	}

	public static void main(String[] args) {
		LockExample example = new LockExample();
		Runnable task = example::doWork;

		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		t1.start();
		t2.start();
	}
}
