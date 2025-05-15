package com.terra.app;

import java.util.*;
import java.util.stream.*;
import java.util.Arrays;


public class Practice {

	public static void main(String[] args) {
		// Creating Stream

		// 1.From Collection
		List<String> names = Arrays.asList("Naveen", "Bob", "Charlie");
		Stream<String> nameStream = names.stream();
		nameStream.iterator().forEachRemaining(n -> System.out.print(n + " "));
		System.out.println();

		// 2.From Arrays
		String[] nameArray = { "Alice", "Bob", "Charlie" };
		Stream<String> arrayStream = Arrays.stream(nameArray);
		arrayStream.iterator().forEachRemaining(n -> System.out.print(n + " "));
		System.out.println();

		// From Static Factory Method
		// Stream.of()
		Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);
		numberStream.iterator().forEachRemaining(n -> System.out.print(n + " "));
		System.out.println();

		// Stream.iterate(infinite)
		Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 2); // even numbers
		infiniteStream.limit(10).iterator().forEachRemaining(n -> System.out.print(n + " "));
		System.out.println();

		// Stream.generate(infinite)
		Stream<Double> randomNumbers = Stream.generate(Math::random);
		randomNumbers.limit(10).iterator().forEachRemaining(n -> System.out.print(n + " "));
		System.out.println();
		
		
		
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

		// filter only numbers
		String[] arr = { "123", "abc", "453", "12g3", "78", "test" };
		List<String> numberList = Arrays.stream(arr).filter(x -> x.matches("\\d+")).collect(Collectors.toList());
		numberList.forEach(System.out::println);
	}

}
