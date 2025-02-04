package com.datastructure.linkedlist;

import com.datastructure.node.DoubleNode;

public class DoubleLinkedList {
	private DoubleNode head;
	private DoubleNode tail;

	private int size;

	public DoubleNode createDoubleLinkedList(int nodeVlaue) {

		head = new DoubleNode();
		DoubleNode node = new DoubleNode();
		node.setValue(nodeVlaue);
		node.setNext(null);
		node.setPrev(null);

		head = node;
		tail = node;

		size = 1;

		return head;

	}

	public boolean existsLinkedList() {
		// if head is not null retrun true otherwise return false
		return head != null;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void traverseLinkedList() {
		if (existsLinkedList()) {
			DoubleNode tempNode = head;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.getValue());
				if (i != size - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.getNext();
			}

		} else {
			System.out.println("Linked List does not exists");
		}
		System.out.println("\n");

	}

	public void insertInLinkedList(int nodeValue, int location) {

		DoubleNode node = new DoubleNode();
		node.setValue(nodeValue);

		if (!existsLinkedList()) {
			System.out.println("The linked list does not exist!!");
			return; // Linked List does not exists
		} else if (location == 0) {
			node.setNext(head);
			node.setPrev(null);
			head.setPrev(node);

			head = node;
		} else if (location >= size) {
			node.setNext(null);
			node.setPrev(tail);
			tail.setNext(node);
			tail = node;

		} else {
			DoubleNode tempNode = head;
			int index = 0;

			while (index < location - 1) {
				tempNode = tempNode.getNext();
				index++;
			}
			node.setPrev(node);
			node.setNext(tempNode.getNext());

			tempNode.setNext(node);
			node.getNext().setPrev(node);

		}
		size++;

	}

	public boolean searchNode(int nodeValue) {
		if (existsLinkedList()) {

			DoubleNode tempNode = head;
			for (int i = 0; i < size; i++) {
				if (tempNode.getValue() == nodeValue) {
					System.out.print("Found the node at locaiton: " + i);
					return true;
				}
				tempNode = tempNode.getNext();
			}
		}
		System.out.print("Node not found!! ");
		return false;

	}

	public void traverseLinkedListInReverseOrder() {

		if (existsLinkedList()) {
			DoubleNode tempNode = tail;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.getValue());
				if (i != size - 1) {
					System.out.print(" <- ");
				}
				tempNode = tempNode.getPrev();
			}
		} else {
			System.out.println("Linked List does not exists");
		}
		System.out.println("\n");

	}

	public void deletionOfNode(int location) {
		if (!existsLinkedList()) {
			System.out.println("The linked list does not exist!!");// Linked List does not exists
			return;
		} else if (location == 0) {
			if (getSize() == 1) { // if this is the only node in this list
				head = tail = null;
				setSize(getSize() - 1);
				return;
			} else {
				head = head.getNext();
				head.setPrev(null);
				setSize(getSize() - 1);
			}
		} else if (location >= getSize()) { // If location is not in range or equal, then delete last node
			DoubleNode tempNode = tail.getPrev(); // temp node points to 2nd last node
			if (tempNode == head) { // if this is the only element in the list
				tail = head = null;
				setSize(getSize() - 1);
				return;
			}
			tempNode.setNext(null);
			tail = tempNode;
			setSize(getSize() - 1);

		} else { // if any inside node is to be deleted
			DoubleNode tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.getNext(); // we need to traverse till we find the location
			}
			tempNode.setNext(tempNode.getNext().getNext()); // delete the required node
			tempNode.getNext().setPrev(tempNode);
			setSize(getSize() - 1);
		} // end of else
	}

	// delete whole linked list
	public void deleteLinkedList() {
		System.out.println("\n\nDeleting Linked List...");
		DoubleNode tempNode = head;
		for (int i = 0; i < size; i++) {
			tempNode.setPrev(null);
			tempNode = tempNode.getNext();
		}

		head = null;
		tail = null;
		System.out.println("Linked List deleted successfully !");
	}

}
