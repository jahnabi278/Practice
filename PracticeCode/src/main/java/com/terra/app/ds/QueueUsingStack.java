package com.terra.app.ds;

import java.util.Stack;

public class QueueUsingStack {

	public static void main(String[] args) {
		QueueCls<String> q = new QueueCls<>();
		q.enqueue("Jahnabi Sharma");
		q.enqueue("Mrigakshi Sharma");
		q.enqueue("Sahil Verma");
		q.enqueue("Pranita Goswami");
		String s = q.dequeue();
		System.out.println(s);
	}
}

class QueueCls<T> {
	private Stack<T> stack1 = new Stack<>();
	private Stack<T> stack2 = new Stack<>();

	public void enqueue(T item) {
		stack1.push(item);
	}

	public T dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}

	private boolean isEmpty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}
}
