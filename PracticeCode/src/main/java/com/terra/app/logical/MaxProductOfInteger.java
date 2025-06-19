package com.terra.app.logical;

import java.util.Arrays;

public class MaxProductOfInteger {

	public static void main(String[] args) {
		int[] intArr = { 5, 55, 9, 98, 44, 49, 0 };
		System.out.println("Before Sorting ------------");
		for (int i : intArr) {
			System.out.print(i + " ");
		}
		Arrays.sort(intArr);

		System.out.println();
		System.out.println("After Sorting -----------");
		for (int i : intArr) {
			System.out.print(i + " ");
		}
		int n = intArr.length;
		int product1 = intArr[n - 1] * intArr[n - 2];
		int product2 = intArr[0] * intArr[1];
		System.out.println();
		System.out.println("Maximum Product of two interge : " + Math.max(product1, product2));
	}

}
