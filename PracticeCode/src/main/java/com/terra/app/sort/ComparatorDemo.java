package com.terra.app.sort;

import java.util.*;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<>();
		integerList.add(73);
		integerList.add(21);
		integerList.add(51);
		integerList.add(11);
		integerList.add(01);
		integerList.add(66);
		integerList.add(29);
		integerList.add(48);
		integerList.add(64);

		Collections.sort(integerList);
		System.out.println(integerList);

	}

}
