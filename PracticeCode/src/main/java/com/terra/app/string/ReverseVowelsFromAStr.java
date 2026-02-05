package com.terra.app.string;

public class ReverseVowelsFromAStr {

	public static void main(String[] args) {
		String str = "helillellulo";
		System.out.println(reversedString(str));
	}

	static String reversedString(String str) {
		int start = 0;
		int last = str.length() - 1;
		char[] charArr = str.toCharArray();
		while (start < last) {
			if (!isVowel(charArr[start])) {
				start++;
			} else if (!isVowel(charArr[last])) {
				last--;
			} else {
				char temp = charArr[start];
				charArr[start] = charArr[last];
				charArr[last] = temp;
				start++;
				last--;
			}
		}
		return String.valueOf(charArr);
	}

	static boolean isVowel(char c) {
		if ('a' == c || 'e' == c || 'i' == c || 'o' == c || 'u' == c || 'A' == c || 'E' == c || 'I' == c || 'O' == c
				|| 'U' == c) {
			return true;
		}
		return false;
	}

}
