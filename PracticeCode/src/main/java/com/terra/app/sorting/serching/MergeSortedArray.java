package com.terra.app.sorting.serching;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {

		int[] num1 = { 1, 2, 3, 0, 0, 0 };
		int[] num2 = { 2, 5, 6 };
		int m = 3, n = 3;
		mergeSortedArray(num1, m, num2, n);
		System.out.println(Arrays.toString(num1));
	}

	private static void mergeSortedArray(int[] num1, int m, int[] num2, int n) {
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;

		while (i >= 0 && j >= 0) {
			if (num1[i] > num2[j]) {
				num1[k--] = num1[i--];
			} else {
				num1[k--] = num2[j--];
			}
		}

	}

}
