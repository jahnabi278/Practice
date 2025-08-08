package com.terra.app.logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableListDemo {

	public static void main(String[] args) {
		List<String> originalList = new ArrayList<>();
		originalList.add("Jahnabi");
		originalList.add("Sahil");
		originalList.add("Mriga");

		List<String> unmodifiablels = Collections.unmodifiableList(originalList);
		System.out.println(unmodifiablels.size());
		System.out.println(unmodifiablels.get(1));
		try {
			unmodifiablels.add("New element");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
