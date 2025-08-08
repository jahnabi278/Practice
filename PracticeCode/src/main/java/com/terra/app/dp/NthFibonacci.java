package com.terra.app.dp;

public class NthFibonacci {

	public static void main(String[] args) {
		System.out.println(nthFibonacci(8));
		System.out.println(nthFibonacciIterative(8));

	}

	private static int nthFibonacciIterative(int n) {
		if (n <= 1) {
			return n;
		}
		int prev = 0;
		int cur = 1;
		for (int i = 2; i <= n; i++) {
			int next = prev + cur;
			prev = cur;
			cur = next;
		}
		return cur;

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
