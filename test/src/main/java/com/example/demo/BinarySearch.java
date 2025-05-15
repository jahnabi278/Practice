package com.example.demo;

public class BinarySearch {
	public static void main(String[] args) {
		int[] intArray = { 10, 20, 30, 40, 50, 60 };
		int index = binarySearch(intArray, 20);
		int[] intArray1 = { 10, 20, 20, 20, 20, 20, 30, 40, 50, 60 };
		int index1 = binarySearchWithRepeatedNumber1stOccurence(intArray1, 20);
		int[] intArray2 = { 10, 20, 20, 20, 20, 20, 30, 40, 50, 60 };
		int index2 = binarySearchWithRepeatedNumberLastOccurence(intArray2, 20);
		int[] intArray3 = { 10, 20, 20, 20, 20, 20, 20, 20, 30, 40, 50, 60 };
		int index3 = linearSearch(intArray3, 20);
		System.out.println(index3);
		System.out.println(index);
		System.out.println(index1);
		System.out.println(index2);

	}

	private static int linearSearch(int[] intArray2, int find) {
		int count = 0;
		for (int i = 0; i < intArray2.length; i++) {
			if (intArray2[i] == find) {
				count++;
			}
		}
		return count;
	}

	private static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			// case 1:
			if (target == arr[mid]) {
				return mid;
				// case 2
			} else if (target < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	private static int binarySearchWithRepeatedNumber1stOccurence(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int result = 0;
		while (low <= high) {
			// 2 147 483 647
			// l =70; int h =2 147 483 647
			int mid = (low + high) / 2; // mid = low + (high -low)/2 ---> mid = (2low + high -low)/2 --> 2mid = 2low
									// +high-low -->mid = (low + high)/2
			// case 1:
			if (target == arr[mid]) {
				result = mid;
				// return r;
				// case 2
				high = mid - 1;
			} else if (target < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return result == 0 ? -1 : result;
	}

	private static int binarySearchWithRepeatedNumberLastOccurence(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int result = 0;
		while (low <= high) {
			// 2 147 483 647
			// l =70; int h =2 147 483 647
			int mid = (low + high) / 2; // mid = low + (high -low)/2 ---> mid = (2low + high -low)/2 --> 2mid = 2low
									// +high-low -->mid = (low + high)/2
			// case 1:
			if (target == arr[mid]) {
				result = mid;
				// return r;
				// case 2
				low = mid + 1;
			} else if (target < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return result == 0 ? -1 : result;
	}

}
