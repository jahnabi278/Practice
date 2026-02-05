package com.terra.app.string;

public class MergeStringAlternatively {

	public static void main(String[] args) {
		String word1 = "subhashini";
		String word2 = "jahnabi";
		System.out.println(getMergedString(word1, word2));
	}

	private static String getMergedString(String word1, String word2) {
		int i = 0;
		StringBuilder resultantString = new StringBuilder();
		while (i < word1.length() || i < word2.length()) {
			if (i < word1.length()) {
				resultantString.append(word1.charAt(i));
			}
			if (i < word2.length()) {
				resultantString.append(word2.charAt(i));
			}
			i++;
		}
		return resultantString.toString();
	}

}
