package com.terra.app.string;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strArr = { "flower", "flow","flight","flon","flor" };
		System.out.println(logestCommonPrefix(strArr));
	}

	private static String logestCommonPrefix(String[] strArr) {
		//Arrays.sort(strArr);
		String str1 = strArr[0];
		String strN = strArr[strArr.length - 1];
		int index = 0;
		while (index < str1.length()) {
			if (str1.charAt(index) == strN.charAt(index)) {
				index++;
			} else {
				break;
			}
		}
		return str1.substring(0, index);
	}

}
