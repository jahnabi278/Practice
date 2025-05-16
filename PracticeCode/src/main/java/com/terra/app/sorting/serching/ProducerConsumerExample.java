package com.terra.app.sorting.serching;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerExample {

	public static void main(String[] args) {
		List<Integer> sharedList = new ArrayList<>();

		// Create and start producer and consumer threads
		Producer producer = new Producer(sharedList);
		Consumer consumer = new Consumer(sharedList);

		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);

		producerThread.start();
		consumerThread.start();

		try {
			producerThread.join();
			consumerThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Producer implements Runnable {
	private final List<Integer> list;
	private static final int SIZE = 10; // Number of items to produce

	public Producer(List<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
		for (int i = 0; i < SIZE; i++) {
			produce(i);
		}
	}

	private synchronized void produce(int number) {
		synchronized (list) {
			list.add(number);
			System.out.println("Produced: " + number);
			list.notify(); // Notify consumer that new item is added
		}
	}
}

class Consumer implements Runnable {
	private final List<Integer> list;

	public Consumer(List<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
		while (true) {
			Integer number = consume();
			if (number == null)
				break; // Exit when no more items are available
			System.out.println("Consumed: " + number);
		}
	}

	private Integer consume() {
		synchronized (list) {
			while (list.isEmpty()) {
				try {
					list.wait(); // Wait until the producer adds an item
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
			return list.isEmpty() ? null : list.remove(0); // Consume item
		}
	}

}
