package com.terra.app.ds;

import java.util.HashMap;

public class LogestSubString {
	
	public static String returnTheLongestSubStringWithKUniqueCharacter(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) {
            return "";
        }
        
        int maxLength = 0;
        int start = 0; // Start index of the longest substring
        String longestSubstring = "";
        
        for (int i = 0; i <= s.length() - k; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            int uniqueCount = 0;

            // Create a substring starting from index i
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                map.put(c, map.getOrDefault(c, 0) + 1);

                // Count how many unique characters we have
                if (map.get(c) == 1) {
                    uniqueCount++;
                }

                // If we have exactly k unique characters, check the length
                if (uniqueCount == k) {
                    int length = j - i + 1;
                    if (length > maxLength) {
                        maxLength = length;
                        longestSubstring = s.substring(i, j + 1);
                    }
                }

                // If we have more than k unique characters, break
                if (uniqueCount > k) {
                    break;
                }
            }
        }
        
        return longestSubstring;
    
    }
	
	 public static void main(String[] args) {
	        String s = "aabacbebebe";
	        int k = 3;
	        System.out.println("Longest substring: " + returnTheLongestSubStringWithKUniqueCharacter(s, k));
	    }

}
