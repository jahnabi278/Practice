package com.terra.app.string;

public class BalancedStringChecker {

	public static void main(String[] args) {
		String inputstr = "33429865949";
		System.out.println(isBalanced(inputstr));

	}

	private static boolean isBalanced(String inputstr) {
		int evenIndexSum = 0;
		int oddIndexSum = 0;
		for (int i = 0; i < inputstr.length(); i++) {
			if (i % 2 == 0) {
				evenIndexSum += inputstr.charAt(i) - '0';
			} else {
				oddIndexSum += inputstr.charAt(i) - '0';
			}
		}
		return evenIndexSum == oddIndexSum;

	}

}
