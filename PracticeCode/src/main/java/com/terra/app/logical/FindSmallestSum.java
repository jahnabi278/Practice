package com.terra.app.logical;

import java.util.Iterator;

public class FindSmallestSum {

	public static void main(String[] args) {
		int[] arr = { 3, -4, 2, -3, -1, 7, -5 };

		// soln1(arr);
		// sliding window
		soln2(arr, 3);
		// brute force approach
		soln3(arr);
	}

	private static void soln3(int[] arr) {
		int start = 0, end = 0;
		int minSum = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum < minSum) {
					minSum = sum;
					start = i;
					end = j;
				}
			}
		}

		System.out.println("Min Sum :" + minSum);
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void soln2(int[] arr, int k) {

		int windowSum = 0;
		for (int i = 0; i < k; i++) {
			windowSum += arr[i];
		}
	}

	private static void soln1(int[] arr) {
		int currentSum = arr[0];
		int minSum = arr[0];
		int start = 0, end = 0, temp = 0;
		for (int i = 1; i < arr.length; i++) {
			if (currentSum > 0) {
				currentSum = arr[i];
				temp = i;
			} else {
				currentSum += arr[i];
			}

			if (currentSum < minSum) {
				minSum = currentSum;
				start = temp;
				end = i;
			}
		}
		System.out.println("Smallest sum :" + minSum);
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
