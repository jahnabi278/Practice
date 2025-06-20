package com.terra.app.logical;

public class FindSecondHighElementFromArray {

	public static void main(String[] args) {
		int[] intArray = { 20, 30, 14, 15, 22, 35, 65, 39 };
		int max1 = 0;
		int max2 = 0;
		if (intArray[0] > intArray[1]) {
			max1 = intArray[0];
			max2 = intArray[1];
		} else {
			max2 = intArray[0];
			max1 = intArray[1];
		}
		for (int i = 2; i < intArray.length; i++) {
			if (intArray[i] > max1) {
				max2 = max1;
				max1 = intArray[i];
			}
		}

		System.out.println("First highest number :" + max1);
		System.out.println("Second higest number :" + max2);
	}

}
