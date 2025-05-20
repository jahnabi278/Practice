package com.terra.app.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapFunction {
	public static void main(String[] args) {
		// return the pair that sum to a given number
		List<Integer> integerList = List.of(2, 3, 4, 5, 1, 6, 7, 8, 9, 11);

		int target = 10;
		List<List<Integer>> ls = integerList.stream()
				.flatMap(i -> integerList.stream().filter(j -> i < j && i + j == target).map(j -> List.of(i, j)))
				.collect(Collectors.toList());

		System.out.println(ls);

		// Optimized Version Using Index-based Stream
		/**
		 * integerList.stream() inside flatMap results in O(n²) complexity due to
		 * repeated traversals. We can improve this by iterating only over the remaining
		 * elements after a given index, thus avoiding redundant comparisons and
		 * ensuring i < j
		 */

		List<List<Integer>> result = IntStream.range(0, integerList.size()).boxed()
				.flatMap(i -> IntStream.range(i + 1, integerList.size())
						.filter(j -> integerList.get(i) + integerList.get(j) == target)
						.mapToObj(j -> List.of(integerList.get(i), integerList.get(j))))
				.collect(Collectors.toList());

		System.out.println(result);

	}
}
