package com.terra.app.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterExample {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 10, 2, 8, 9, 8, -3, -6, -7, 4, 5, 10, 3, 2, 8, 5, -3, 4, 2);

		List<Integer> even = numbers.stream().filter(n -> n > 0 && n % 2 == 0).distinct().sorted()
				.collect(Collectors.toList());

		List<Integer> odd = numbers.stream().filter(n -> n > 0 && n % 2 != 0).distinct().sorted()
				.collect(Collectors.toList());

		List<Integer> negative = numbers.stream().filter(n -> n < 0).distinct().sorted().collect(Collectors.toList());

		System.out.println("even: " + even);
		System.out.println("odd: " + odd);
		System.out.println("negative: " + negative);

		/**
		 * smallest 2 from each category
		 */

		List<Integer> num = Arrays.asList(1, 10, 2, 8, 9, 8, -3, -6, -7, 4, 5, 10, 3, 2, 8, 5, -3, 4, 2);

		List<Integer> ev = num.stream().filter(n -> n > 0 && n % 2 == 0).distinct().sorted().limit(2)
				.collect(Collectors.toList());

		List<Integer> od = num.stream().filter(n -> n > 0 && n % 2 != 0).distinct().sorted().limit(2)
				.collect(Collectors.toList());

		List<Integer> neg = num.stream().filter(n -> n < 0).distinct().sorted().limit(2).collect(Collectors.toList());

		System.out.println("even: " + ev);
		System.out.println("odd: " + od);
		System.out.println("negative: " + neg);
		
		/**
		 * single stream pipeline
		 */
       callFunction();
		
	}

	private static void callFunction() {
		List<Integer> numbers = Arrays.asList(1, 10, 2, 8, 9, 8, -3, -6, -7, 4, 5, 10, 3, 2, 8, 5, -3, 4, 2);

        Map<String, List<Integer>> result = numbers.stream()
                .filter(n -> n != 0)
                .distinct()
                .sorted()
                .flatMap(n -> {
                    if (n < 0) {
                        return Stream.of(new AbstractMap.SimpleEntry<>("negative", n));
                    } else if (n % 2 == 0) {
                        return Stream.of(new AbstractMap.SimpleEntry<>("even", n));
                    } else {
                        return Stream.of(new AbstractMap.SimpleEntry<>("odd", n));
                    }
                })
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.mapping(Map.Entry::getValue, Collectors.toList())
                ));

        System.out.println("even: " + result.getOrDefault("even", Collections.emptyList()));
        System.out.println("odd: " + result.getOrDefault("odd", Collections.emptyList()));
        System.out.println("negative: " + result.getOrDefault("negative", Collections.emptyList()));
	}
}
