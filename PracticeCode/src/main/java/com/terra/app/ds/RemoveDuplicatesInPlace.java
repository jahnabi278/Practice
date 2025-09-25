package com.terra.app.ds;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInPlace {
	/**
	 * O(n) time complexity O(k) space where k = unique elements
	 */
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 1, 3, 1, 4, 2, 5, 7, 3, 2, 3, 1 };
		Arrays.stream(arr).forEach(System.out::print);

		int newLength = removeDuplicates(arr);

		System.out.print("Array after removing duplicates: ");
		for (int i = 0; i < newLength; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int removeDuplicates(int[] arr) {
		Set<Integer> seen = new HashSet<>();
		int writeIndex = 0;

		for (int readIndex = 0; readIndex < arr.length; readIndex++) {
			if (!seen.contains(arr[readIndex])) {
				seen.add(arr[readIndex]);
				arr[writeIndex] = arr[readIndex];
				writeIndex++;
			}
		}
		return writeIndex;
	}

}
