package com.terra.app.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighest {

	public static void main(String[] args) {
		List<Integer> listOfNumber = Arrays.asList(88, 55, 29, 30, 45, 59, 67);
		Integer rs = listOfNumber.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElse(null);
		System.out.println(rs);

		listOfNumber.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
	}

}
