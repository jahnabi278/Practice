package com.terra.app.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestStream {

	public static void main(String[] args) {
		List<Integer> listOfNumber = Arrays.asList(2, 3, 4, 5, 6);
		List<String> listOfString = Arrays.asList("Reflection", "Collection", "Stream");
		/**
		 * demostration of map()
		 */
		List<Integer> sqaureList = listOfNumber.stream().map(x -> x * x).collect(Collectors.toList());
		/**
		 * demostrate filter()
		 */
		List<String> stringStartsWithS = listOfString.stream().filter(s -> s.startsWith("S"))
				.collect(Collectors.toList());
		/**
		 * demostrate sorted()
		 */
		List<String> sortedString = listOfString.stream().sorted().collect(Collectors.toList());
		/**
		 * demonstate collect()
		 */
		Set<Integer> squareSet = listOfNumber.stream().map(x -> x * x).collect(Collectors.toSet());
		/**
		 * demostrate forEach()
		 */
		listOfNumber.stream().forEach(x -> System.out.println(x));
		/**
		 * demostrate reduce()
		 */
		int reducedNumber = listOfNumber.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
		System.out.println(sqaureList);
		System.out.println(stringStartsWithS);
		System.out.println(sortedString);
		System.out.println(squareSet);
		System.out.println(reducedNumber);
	}

}
