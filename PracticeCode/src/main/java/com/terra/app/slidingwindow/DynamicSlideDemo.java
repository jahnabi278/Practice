package com.terra.app.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class DynamicSlideDemo {
	
	/**
	 * List of qn sliding window -- algomaster.io
	 * -------------------------------------------
	 * Dynamic size -
	 * 1.Longest substring without repeating character 
	 * 2.Longest repeating character replacement 
	 * 3.minimum size subArr sum
	 * 4.Max consecutiveOnes III   
	 * 
	 */

	// 3 : Length of longest substring without repeating character
	// Time Complexity = O(n)
	// Space Complexity = O(k) - k is the size of the character set
	public static void main(String[] args) {

		String str = "abbcderaxxabcwbaba";
		int maxLength = lengthOfLongestUniqueElemnetSubString1(str);
		System.out.println(maxLength);
	}

	private static int lengthOfLongestUniqueElemnetSubString(String str) {
		int lengthOfStr = str.length();
		Set<Character> charSet = new HashSet<>();
		int maxLength = 0;
		int left = 0;

		// expand window by moving right direction
		for (int right = 0; right < lengthOfStr; right++) {
			// if duplicate found , shrink the window from the left

			while (charSet.contains(str.charAt(right))) {
				charSet.remove(str.charAt(left));
				left++;
			}
			// Add current character to window and update max length
			charSet.add(str.charAt(right));
			maxLength = Math.max(maxLength, right - left + 1);
		}
		return maxLength;
	}

	// Using frequency arr
	private static int lengthOfLongestUniqueElemnetSubString1(String str) {
		int lengthOfStr = str.length();
		int[] freqArr = new int[128]; // ASCII character frequency array
		int maxLength = 0;
		int left = 0;

		// expand window by moving right direction
		for (int right = 0; right < lengthOfStr; right++) {
			char currentChar = str.charAt(right);

			freqArr[currentChar]++; // increase frequency of the current character

			// if duplicate found , shrink the window from the left

			while (freqArr[currentChar] > 1) {
				freqArr[str.charAt(left)]--;
				left++;
			}
			// Add current character to window and update max length
			maxLength = Math.max(maxLength, right - left + 1);
		}
		return maxLength;
	}

}
