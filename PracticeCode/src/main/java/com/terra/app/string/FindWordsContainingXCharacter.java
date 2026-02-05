package com.terra.app.string;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingXCharacter {

	public static void main(String[] args) {
		String[] inputArr = { "Jahnabi", "Sharma", "Mriga", "Sharma" };
		System.out.println(getListOfIndexesContainingXChar(inputArr, 'r'));
	}

	private static List<Integer> getListOfIndexesContainingXChar(String[] inputArr, char c) {
		List<Integer> resultantList = new ArrayList<>();
		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i].contains(String.valueOf(c))) {
				resultantList.add(i);
			}
		}
		return resultantList;
	}

}
