package com.terra.app.string;

public class LastWordLength {

	public static void main(String[] args) {
		String str = " Hello   Jahnabi!!! How are you doing?  ";
		System.out.println(getCountOfLastWordFromStr(str));

	}

	static int getCountOfLastWordFromStr(String str) {
		str = str.trim();
		int count = 0;
		for (int i = str.length() - 1; i > 1; i--) {
			if (str.charAt(i) == ' ') {
				break;
			}
			count++;
		}
		return count;

	}

}
