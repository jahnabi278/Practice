package com.terra.app.logical;

public class NonRepeatedSubString {

	public static void main(String[] args) {
		String str = "empeloyee";
		System.out.println(longestSubString(str));
	}

	private static String longestSubString(String str) {
		String longest = "";
		String current = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (current.indexOf(c) != -1) {
				int index = current.indexOf(c);
				String s = current.substring(current.indexOf(c));
				current = current.substring(current.indexOf(c) + 1);
			}
			current += c;
			if (current.length() > longest.length()) {
				longest = current;
			}
		}
		return longest;
	}

}
