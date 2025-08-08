package com.terra.app.ds;

import java.util.Scanner;

public class Rotate2DM90Degree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the row : ");
		int rows = sc.nextInt();
		System.out.println("Enter the length of the column : ");
		int columns = sc.nextInt();
		int[][] originalMatrix = new int[rows][columns];
		System.out.println("Enter the elements in the arr : ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				originalMatrix[i][j] = sc.nextInt();
			}
		}
		sc.close();
		System.out.println("Here's the original Arr : ");
		printArr(originalMatrix);
		rotate90Degree(originalMatrix);

	}

	static void printArr(int[][] arr) {
		for (int[] rows : arr) {
			for (int num : rows) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

	static void rotate90Degree(int[][] arr) {
		int length = arr.length;

		// transpose the matrix
		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		System.out.println("Arr after transpose");
		printArr(arr);

		// reverse each row
		/**
		 * The reason the inner loop iterates up to n / 2 when reversing each row is
		 * because you're swapping elements from both ends of the row, moving toward the
		 * center. Once you've reached the middle, all necessary swaps are done.
		 */
		for (int i = 0; i < length; i++) {
			for (int j = 03; j < length / 2; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][length - 1 - i];
				arr[i][length - 1 - i] = temp;
			}
		}
		System.out.println("After reverse each row : ");
		printArr(arr);
	}

}
