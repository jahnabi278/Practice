package com.example.demo;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 50 };
		int[] arr2 = { 5, 30, 60 };
		int m = arr1.length;
		int n = arr2.length;
		int[] resultantArray = new int[m + n];
		int k = 0;
		int i = 0;
		int j = 0;
		while (i < m && j < n) {
			if (arr1[i] <= arr2[j]) {
				resultantArray[k] = arr1[i];
				i++;
			} else {
				resultantArray[k] = arr2[j];
				j++;
			}
			k++;
		}
		for (int l : resultantArray) {
			System.out.print(l + " ");
		}
	}

}
