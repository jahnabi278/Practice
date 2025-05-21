package com.terra.app.ds;

public class Stack {

	public int arr[];
	private int top;
	private int capacity;

	Stack(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;//index count of the array
	}

	public void push(int x) {
		if (isFull()) {
			System.exit(1);
		}
		arr[++top] = x;
	}

	public int pop() {
		if (isEmpty()) {
			System.exit(1);
		}
		return arr[top--];
	}

	private boolean isEmpty() {
		return top == -1;
	}

	private boolean isFull() {
		return top == capacity - 1;
	}

	public static void main(String[] args) {
		Stack s = new Stack(3);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.pop());
	}
}
