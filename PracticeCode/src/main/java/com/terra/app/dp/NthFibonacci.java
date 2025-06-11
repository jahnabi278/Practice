package com.terra.app.dp;

public class NthFibonacci {

	public static void main(String[] args) {
		System.out.println(nthFibonacci(8));

	}

	static int nthFibonacci(int n) {
		// Base case: if n is 0 or 1, return n
		if (n <= 1) {
			return n;
		}
		// Recursive case: sum of the two preceding
		// Fibonacci numbers

		return nthFibonacci(n - 1) + nthFibonacci(n - 2);
	}

}
