package com.terra.app.string;

public class PalindromeChecker {

	public static void main(String[] args) {
		String str = "A man, a plan, a canal: Panama";
		System.out.println(isValidPalindrome(str));
	}

	private static boolean isValidPalindrome(String str) {
		str = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		System.out.println(str);
		int first = 0;
		int last = str.length() - 1;
		return false;
	}

}
