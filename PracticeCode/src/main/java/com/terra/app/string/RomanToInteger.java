package com.terra.app.string;

import java.util.*;

public class RomanToInteger {

	public static void main(String[] args) {
		String romanStr = "MCDDCCXMX";
		System.out.println(getTheEquivalentInteger(romanStr));
	}

	private static int getTheEquivalentInteger(String romanStr) {
		Map<Character, Integer> romanToIntMap = new HashMap<>();
		romanToIntMap.put('I', 1);
		romanToIntMap.put('V', 5);
		romanToIntMap.put('X', 10);
		romanToIntMap.put('L', 50);
		romanToIntMap.put('C', 100);
		romanToIntMap.put('D', 500);
		romanToIntMap.put('M', 1000);
		int result = romanToIntMap.get(romanStr.charAt(romanStr.length() - 1));
		for (int i = romanStr.length() - 2; i >= 0; i--) {
			if (romanToIntMap.get(romanStr.charAt(i)) < romanToIntMap.get(romanStr.charAt(i+1))) {
				result = result - romanToIntMap.get(romanStr.charAt(i));
			} else {
				result += romanToIntMap.get(romanStr.charAt(i));
			}
		}
		return result;

	}

}
