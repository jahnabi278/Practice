package com.example.demo;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the number you want to check :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int reverseNumber = 0;
		int temp = number;
		while (temp > 0) {
			int remainder = temp % 10;
			reverseNumber = reverseNumber * 10 + remainder;
			temp = temp / 10;
		}
		if (number == reverseNumber) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}
		

	}

}
