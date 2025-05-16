package com.terra.app.logical;

public class ReverseString {
	public static void main(String[] args) {
		String strToReverse = "Jahnabi";
		char[] charArr = strToReverse.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = charArr.length - 1; i >= 0; i--) {
			sb.append(charArr[i]);
		}
		System.out.println(sb.toString());
	}

}
