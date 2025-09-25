package com.terra.app.ds;

import java.util.HashMap;

public class SliodingWindowWithNonRepeatedSubString {

	public static void main(String[] args) {
		String str = "abgehgduggfftttgjsffdgbjsyyytrewmfg";
		findLongestUniqueSubstring(str);
	}

	public static void findLongestUniqueSubstring(String s) {
		HashMap<Character, Integer> lastSeen = new HashMap<>();
		int start = 0, maxLen = 0, maxStart = 0;

		for (int end = 0; end < s.length(); end++) {
			char currentChar = s.charAt(end);

			if (lastSeen.containsKey(currentChar) && lastSeen.get(currentChar) >= start) {
				start = lastSeen.get(currentChar) + 1;
			}

			lastSeen.put(currentChar, end);

			if (end - start + 1 > maxLen) {
				maxLen = end - start + 1;
				maxStart = start;
			}
		}

		String longestSubstring = s.substring(maxStart, maxStart + maxLen);
		System.out.println("Length of longest substring: " + maxLen);
		System.out.println("Longest substring: '" + longestSubstring + "'");

	}

}
