package com.terra.app.logical;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		System.out.println(isPrimeNumber(number));

	}

	/**
	 * O(n) time complexity
	 * 
	 * @param number
	 * @return
	 */
	private static boolean isPrimeNumber(int number) {
		if (number == 0 || number == 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
