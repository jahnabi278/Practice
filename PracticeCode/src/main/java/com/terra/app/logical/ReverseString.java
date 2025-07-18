package com.terra.app.logical;

public class ReverseString {
	public static void main(String[] args) {
		String strToReverse = "Jahnabi Sharma";
		char[] charArr = strToReverse.toCharArray();
		StringBuilder sb = new StringBuilder();
		// without using build-in method
		for (int i = charArr.length - 1; i >= 0; i--) {
			sb.append(charArr[i]);
		}
		System.out.println(sb.toString());
		String reverseStr = "";
		for (int i = charArr.length - 1; i >= 0; i--) {
			reverseStr += charArr[i];
		}
		System.out.println(reverseStr);
		// build-in function
		System.out.println(new StringBuilder(strToReverse).reverse().toString());
	}

}
