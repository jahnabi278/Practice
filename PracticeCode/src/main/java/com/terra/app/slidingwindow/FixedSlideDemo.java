package com.terra.app.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FixedSlideDemo {

	// 643 : Maximum average subArray
	// Time Complexity = O(n)
	// Space Complexity = O(1)

	/**
	 * 
	 * List of qn sliding window -- algomaster.io 1.Find all anagram in a string
	 * 2.Permutation in String 3.Max sum of distinct subArrays with length k
	 * 4.SubString with concatenation of all Words (HARD) 5.Maximum Average SubArr
	 * -- done
	 * 
	 **/
	public static void main(String[] args) {
		int[] nums = { 1, 12, -5, -6, 50, 3 };
		double maxAvg = findMaxAverage(nums, 4);
		System.out.println(maxAvg);

		String text = "cbaebabacd";
		String pattern = "abc";

		List<Integer> result = findAnagrams(text, pattern);
		System.out.println(result);

	}

	private static List<Integer> findAnagrams(String text, String pattern) {
		List<Integer> listOfAnagram = new ArrayList<>();
		if (text.length() < pattern.length()) {
			return listOfAnagram;
		}
		int[] pCount = new int[26];
		int sCount[] = new int[26];

		for (char c : pattern.toCharArray()) {
			pCount[c - 'a']++;
		}

		int windowSize = pattern.length();
		for (int i = 0; i < text.length(); i++) {
			sCount[text.charAt(i) - 'a']++;

			if (i >= windowSize) {
				sCount[text.charAt(i - windowSize) - 'a']--;
			}

			if (Arrays.equals(pCount, sCount)) {
				listOfAnagram.add(i - windowSize + 1);
			}
		}

		return listOfAnagram;
	}

	private static double findMaxAverage(int[] nums, int k) {
		int n = nums.length;
		// compute the sum of the first kth element

		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += nums[i];
		}

		// initialize max_sum as the sum of the first window
		int maxSum = sum;

		// Slide the window across the array

		for (int i = k; i < n; i++) {
			sum += nums[i] - nums[i - k]; // Add new element entering window
			maxSum = Math.max(maxSum, sum); // update maxSum
		}
		// return maximum average
		return (double) maxSum / k;
	}

}
