package com.terra.app.logical;

import java.util.HashSet;
import java.util.Set;

public class TargetFromArray {

	public static void main(String[] args) {
		// unsorted array

	}
//
	boolean findInUnsortedArray(int[] arr, int target) {
		Set<Integer> intSet = new HashSet<>();
		for (int i : arr) {
			intSet.add(i);
		}
		return intSet.contains(target);

	}

}
