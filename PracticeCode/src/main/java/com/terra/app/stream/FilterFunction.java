package com.terra.app.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterFunction {
	public static void main(String[] args) {
		// return even numbers from the list
		List<Integer> integerList = List.of(2, 3, 4, 5, 1, 6, 7, 8, 9, 11);
		integerList.stream().filter(x -> (x % 2 == 0)).collect(Collectors.toList()).iterator()
				.forEachRemaining(x -> System.out.println(x));
		// printing as list
		System.out.println(integerList.stream().filter(x -> (x % 2 == 0)).collect(Collectors.toList()));

		// String start with character

		List<String> names = List.of("Alice", "BOB", "Charlie", "Devid", "Chinku");

		List<String> nameStream = names.stream().filter(n -> n.toLowerCase().startsWith("c"))
				.collect(Collectors.toList());
		System.out.println(nameStream);
		// find first string
		Optional<String> firstStream = names.stream().filter(n -> n.toLowerCase().startsWith("c")).findFirst();
		System.out.println(firstStream.get());
		
		

	}
}
