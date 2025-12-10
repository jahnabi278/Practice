package com.terra.app.linkedlist;

public class LinkedList {
	public static void main(String[] args) {
		LinkedListImpl impl = new LinkedListImpl();
		impl.insert(10);
		impl.insert(20);
		impl.insert(30);
		impl.insert(60);
		impl.insert(40);
		impl.display();

	}
}

class LinkedListImpl {
	Node head;

	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;

		}

	}
}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}