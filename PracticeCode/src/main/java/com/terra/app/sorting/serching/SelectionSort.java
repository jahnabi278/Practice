package com.terra.app.sorting.serching;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 3, 1, 8, 4, 9 };

		System.out.println("Before sorting ........");
		System.out.println();
		for (int i : arr) {
			System.out.print(i + " ");
		}
		selectionSort(arr);

		System.out.println();
		System.out.println("after sorting ........");
		System.out.println();
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
}
