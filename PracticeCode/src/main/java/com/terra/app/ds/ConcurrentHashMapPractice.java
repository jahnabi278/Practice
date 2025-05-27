package com.terra.app.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapPractice {

	public static void main(String[] args) {
		HistoryMap<String, String> historymap = new HistoryMap<>();
		for (int i = 0; i < 12; i++) {
			historymap.put("user1", "val" + i);
		}
		System.out.println(historymap.get("user1") + " ");
		System.out.println(historymap.getHistory("user1"));

	}

}

class HistoryMap<K, V> {

	/**
	 * A queue is a linear data structure that operates on a First-In, First-Out
	 * (FIFO) principle, meaning elements are added to the rear and removed from the
	 * front. A dequeue (double-ended queue) extends this by allowing elements to be
	 * added or removed from both the front and the rear.
	 */
	private final ConcurrentHashMap<K, Deque<V>> map = new ConcurrentHashMap<>();
	private final int MAX_HISTORY = 10;

	public void put(K key, V value) {

		map.compute(key, (k, deque) -> {
			if (deque == null) {
				deque = new LinkedList<>();
			}
			synchronized (deque) {
				deque.addFirst(value);
				if (deque.size() > MAX_HISTORY) {
					deque.removeLast();
				}
			}
			return deque;
		});

	}

	public List<V> getHistory(String key) {
		Deque<V> deque = map.get(key);
		if (deque == null) {
			return Collections.emptyList();
		}
		synchronized (deque) {
			return new ArrayList<>(deque);
		}
	}

	public V get(String key) {
		Deque<V> deque = map.get(key);
		if (deque == null) {
			return null;
		}
		synchronized (deque) {
			return deque.peekFirst();
		}
	}

}
