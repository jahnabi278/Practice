package com.terra.app.logical;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows for the pattern :");
		int rows = sc.nextInt();
		System.out.println("Pattern ........................");
		printPattern(rows);

	}

	private static void printPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			int whiteSpace = rows - 1;
			printPattern(" ", whiteSpace);
			printPattern(i + " ", i);
			System.out.print("\n");
		}

	}

	private static void printPattern(String string, int whiteSpace) {
		for (int j = 0; j < whiteSpace; j++) {
			System.out.print(string);
		}

	}

}
