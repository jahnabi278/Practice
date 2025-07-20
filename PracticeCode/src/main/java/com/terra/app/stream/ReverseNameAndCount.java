package com.terra.app.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ReverseNameAndCount {

	public static void main(String[] args) {
		String[] names = { "Jahnabi", "Sahil", "Mriga", "Mriga", "Sahil", "Sahil" };
		Map<String, Long> map = Arrays.stream(names).map(name -> new StringBuilder(name).reverse().toString())
				.sorted((a, b) -> b.compareTo(a)).collect(Collectors.groupingBy(name -> name, Collectors.counting()));
		map.forEach((k, v) -> System.out.println(k + " :" + v));

		Map<Object, Long> map2 = Arrays.stream(names).map(name -> new StringBuilder().append(name).reverse().toString())
				.collect(Collectors.groupingBy(name -> name, Collectors.counting()));
		map2.forEach((k, v) -> System.out.println(k + " :" + v));

	}

}
