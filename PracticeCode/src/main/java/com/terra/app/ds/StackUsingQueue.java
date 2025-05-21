package com.terra.app.ds;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	public static void main(String[] args) {
		StackCls<Integer> stack = new StackCls<>();
		stack.push(3);
		stack.push(4);
		stack.push(2);
		System.out.println(stack.pop());
	}
}

class StackCls<T> {
	private Queue<T> q1 = new LinkedList<>();
	private Queue<T> q2 = new LinkedList<>();

	public void push(T item) {
		q1.add(item);
	}

	public T pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		while (q1.size() > 1) {
			q2.add(q1.remove());
		}
		T item = q1.remove();
		Queue<T> temp = q1;
		q1 = q2;
		q2 = temp;
		return item;
	}

	private boolean isEmpty() {
		return q1.isEmpty() && q2.isEmpty();
	}

}
