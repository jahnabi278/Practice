package com.terra.app.logical;

public class NonDecreasingArray {
	
	public static void main(String[] args) {
		int num1[] = { 4, 2, 3 };
		int num2[] = { 4, 2, 1 };
		int num3[] = { 3, 4, 2, 3 };

		System.out.println(checkPossibility(num1));
		System.out.println(checkPossibility(num2));
		System.out.println(checkPossibility(num3));

	}

	private static boolean checkPossibility(int[] num) {
		int count = 0;// count of modification

		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] > num[i + 1]) {
				count++;
				if (count > 1) {
					return false;
				}

				if (i == 0 || num[i - 1] <= num[i + 1]) {
					num[i] = num[i + 1];
				} else {
					num[i + 1] = num[i];
				}

			}
		}
		return true;
	}

}
