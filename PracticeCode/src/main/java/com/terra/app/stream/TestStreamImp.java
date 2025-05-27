package com.terra.app.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestStreamImp {

	public static void main(String[] args) {
		String input = "Java is programming language";

		// Normalize case
		String normalized = input.toLowerCase();

		// Vowels with frequency
		System.out.println("Vowel Frequencies:");
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

		Map<Character, Long> vowelFreq = normalized.chars().mapToObj(c -> (char) c).filter(vowels::contains)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		vowelFreq.forEach((k, v) -> System.out.println(k + " = " + v));
		
		

		System.out.println("\nCharacter Frequencies (excluding space):");
		Map<Character, Long> charFreq = normalized.chars().mapToObj(c -> (char) c).filter(c -> c != ' ') // ignore space
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		charFreq.forEach((k, v) -> System.out.println(k + " = " + v));

		System.out.println("\nWord Frequencies:");
		Map<String, Long> wordFreq = Arrays.stream(normalized.split("\\s+"))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		wordFreq.forEach((k, v) -> System.out.println(k + " = " + v));
	}

}
