package com.terra.app.stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharFrequency {

	public static void main(String[] args) {
		char[] c = { 'a', 'b', 'a', 'a', 'b' };
		Map<Character, Long> map = IntStream.range(0, c.length).mapToObj(i -> c[i])
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map.forEach((K, V) -> System.out.println(K + " : " + V));
		
		
		Map<Character, Long> map1 = IntStream.range(0, c.length).mapToObj(i -> c[i]).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		map1.forEach((K,V)-> System.out.println(K +" :" +V));
		
		
		IntStream.range(0, c.length).mapToObj(i -> c[i]).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		map1.forEach((k,v)-> System.out.println(k +":"+v));
	}

}
