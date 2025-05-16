package com.terra.app.logical;

public class FibonacciSeries {
	public static void main(String args[]) {
		// 0,1,1,2,3,5,8,13, 21, 34.....
		int number = 20;
		int firstNumber = 0;
		int secondNumber = 1;
		int nextNumber = 0;
		for (int i = 1; i <= number; i++) {
			System.out.print(firstNumber + ",");
			nextNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = nextNumber;
		}
	}

}
