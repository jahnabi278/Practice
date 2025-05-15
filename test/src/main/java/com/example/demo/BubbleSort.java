package com.example.demo;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 7, 1, 2, 4, 9, 3 ,22,11,30,51,15};
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println();
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
