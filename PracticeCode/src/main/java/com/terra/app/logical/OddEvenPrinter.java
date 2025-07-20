package com.terra.app.logical;

public class OddEvenPrinter {
	private static final int LIMIT = 10;
	private int number = 1;
	private final Object lock = new Object();

	public static void main(String[] args) {
		OddEvenPrinter printer = new OddEvenPrinter();

		Thread oddThread = new Thread(() -> printer.printOdd(), "Odd-Thread");
		Thread evenThread = new Thread(() -> printer.printEven(), "Even-Thread");

		oddThread.start();
		evenThread.start();
	}

	public void printOdd() {
		while (number <= LIMIT) {
			synchronized (lock) {
				if (number % 2 == 1) {
					System.out.println(Thread.currentThread().getName() + " -> " + number);
					number++;
					lock.notify(); // wake up even thread
				} else {
					try {
						lock.wait(); // wait for even thread
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}
			}
		}
	}

	public void printEven() {
		while (number <= LIMIT) {
			synchronized (lock) {
				if (number % 2 == 0) {
					System.out.println(Thread.currentThread().getName() + " -> " + number);
					number++;
					lock.notify(); // wake up odd thread
				} else {
					try {
						lock.wait(); // wait for odd thread
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}
			}
		}
	}

}
