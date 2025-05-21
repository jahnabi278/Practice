package com.terra.app.ds;

public class LinkedList {

	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		ls.append(4);
		ls.append(3);
		ls.append(3);
		ls.append(6);
		ls.printList();
		System.out.println();
		System.out.println(ls.contains(3));
		ls.delete(3);
		ls.printList();
		System.out.println();

		ls.append(7);
		ls.append(9);
		ls.printList();

	}

	Node head;

	public void append(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	public void delete(int data) {
		if (head == null) {
			return;
		}
		if (head.data == data) {
			head = head.next;
			return;
		}
		Node current = head;
		while (current.next != null && current.next.data != data) {
			current = current.next;
		}
		if (current.next == null) {
			return;
		}
		current.next = current.next.next;
		return;
	}

	public boolean contains(int data) {
		Node current = head;
		while (current != null) {
			if (current.data == data) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
	}

}

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
