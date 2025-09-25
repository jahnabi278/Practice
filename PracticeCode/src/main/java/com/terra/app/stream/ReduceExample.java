package com.terra.app.stream;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 4, 5);
		System.out.println(numbers.stream().reduce(0, (a, b) -> a + b));

		List<String> words = Arrays.asList("Hello", "World", "Java");

		String result = words.stream().reduce("", (a, b) -> a + " " + b);

		System.out.println(result); // Output: "Hello World Java"

	}

}
