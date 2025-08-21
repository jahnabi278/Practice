package com.terra.app.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapExample {

	public static void main(String[] args) {

		List<List<String>> nestedList = Arrays.asList(Arrays.asList("A", "B"), Arrays.asList("C", "D"));

		List<String> flatList = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());

		System.out.println(flatList); // Output: [A, B, C, D]

	}

}
