package com.terra.app.ds;

import java.util.PriorityQueue;

public class KthLargestElement {
	public static int findKthLargest(int[] nums, int k) {
		// Min-heap to keep track of top k largest elements
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		for (int num : nums) {
			minHeap.offer(num);

			// Keep only k elements in the heap
			if (minHeap.size() > k) {
				minHeap.poll(); // Remove the smallest
			}
		}

		// The top of the heap is the kth largest
		return minHeap.peek().intValue();
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 1, 5, 6, 4 };
		int k = 2;
		System.out.println("Kth largest element is: " + findKthLargest(nums, k)); // Output: 5
		PriorityQueue<Integer> ln = new PriorityQueue<>();
		for (int i : nums) {
			ln.add(i);
		}
		System.out.println(ln);
		ln.poll();
		System.out.println(ln);
	}

}
