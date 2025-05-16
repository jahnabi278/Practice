package com.terra.app.logical;

public class CheckIfVowelPresent {

	public static void main(String[] args) {
		String inputString = "Hello";
		System.out.println(stringContainsVowel(inputString));
	}

	/**
	 * Match a single character present in the list below [aeiou]
	 * 
	 * @param inputString
	 * @return
	 */
	private static boolean stringContainsVowel(String inputString) {
		return inputString.toLowerCase().matches(".*[aeiou]*.");
	}

}
