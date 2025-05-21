package com.terra.app.ds;

public class Queue {

	public static void main(String[] args) {
		Queue q = new Queue(3);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(5);
		System.out.println(q.dequeue());
	}

	public int arr[];
	private int front;
	private int rear;
	private int capacity;
	private int count;

	Queue(int size) {
		arr = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}

	public void enqueue(int x) {
		if (isFull()) {
			System.exit(1);
		}
		rear = (rear + 1) % capacity;
		arr[rear] = x;
		count++;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.exit(1);
		}
		int x = arr[front];
		front = (front + 1) % capacity;
		count--;
		return x;
	}

	private boolean isEmpty() {
		return count == 0;
	}

	private boolean isFull() {
		return count == capacity;
	}
}
