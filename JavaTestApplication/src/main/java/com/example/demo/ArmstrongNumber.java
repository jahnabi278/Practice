package com.example.demo;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// 153 : No of digit - 3 |153 -> 1^3+5^3+3^3 ->1+125+27 =153 is a armstrong
		// number
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean result = isArmstrongNumber(number);
		if (result) {
			System.out.println("Entered no is armstrong number.");
		} else {
			System.out.println("Entered no is not armstrong number.");
		}

	}

	private static boolean isArmstrongNumber(int number) {
		int digit = 0;
		int temp = number;
		while (temp > 0) {
			temp = temp / 10;
			digit++;
		}
		System.out.println("digit :" + digit);
		temp = number;
		int sum = 0;
		int num = 0;
		while (temp > 0) {
			num = temp % 10;
			sum = sum + (int) Math.pow(num, digit);
			temp = temp / 10;
		}
		System.out.println("Sum : " + sum);

		if (number == sum) {
			return true;
		}
		return false;

	}

}
