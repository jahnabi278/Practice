package com.terra.app.logical;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
	public static void main(String[] args) {
		int[] arr = { 15, 10, 16, 20, 8, 9, 7, 50 };
		nextGreater(arr);
	}

	private static void nextGreater(int[] arr) {
		int length = arr.length;
		int[] result = new int[length];
		Stack<Integer> stack = new Stack<>();
		Arrays.fill(result, Integer.MAX_VALUE);
		for (int i = length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();
			}
			if (!stack.isEmpty()) {
				result[i] = stack.peek();
			}
			stack.push(arr[i]);
		}

		// display
		for (int i = 0; i < length; i++) {
			System.out.println(arr[i] + "-" + (result[i] == Integer.MAX_VALUE ? "max integer" : result[i]));
		}
	}

}
