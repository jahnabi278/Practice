package com.terra.app.leetcode;

public class RemoveElement {

	public static void main(String[] args) {
		int[] num = { 0, 1, 2, 2, 3, 2, 0, 4, 5, 7, 2 };
		int valToRemove = 2;
		int count = removeValAndReturnNonValElementCount(num, valToRemove);
		System.out.println(count);
		System.out.println("Modified array after removal of val element : ");
	        for (int i = 0; i < num.length; i++) {
	        	if(num[i]!=valToRemove) {
		            System.out.print(num[i] + ", ");
	        	}
	        }
	        System.out.println("]");

	}

	private static int removeValAndReturnNonValElementCount(int[] num, int valToRemove) {
		int k = 0;
		for (int i : num) {
			if (i != valToRemove) {
				num[k++] = num[k];
			}
		}
		return k;
	}

}
