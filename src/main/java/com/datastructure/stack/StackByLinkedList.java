package com.datastructure.stack;

import com.datastructure.linkedlist.SingleLinkedList;

public class StackByLinkedList {

	SingleLinkedList list;

	public StackByLinkedList() {
		list = new SingleLinkedList();
	}

	public void push(int value) {
		if (list.getHead() == null) {
			list.createSingleLinkedList(value);
		} else {
			list.insertInLinkedList(value, 0);
		}

		System.out.println("Inserted " + value + " in Stack !");

	}

	public boolean isEmpty() {
		if (list.getHead() == null)
			return true;

		return false;
	}

	public int peek() {
		if (isEmpty()) {
			return list.getHead().hashCode();
		} else {
			System.out.println("The stack is empty!!");
			return -1;
		}
	}

	public void deleteStack() {
		list.setHead(null);
	}

	public int pop() {
		int value = -1;
		if (isEmpty()) {
			System.out.println("Stack underflow error!!");
		} else {
			value = list.getHead().getValue();
			list.deletionOfNode(0);
		}

		return value;
	}

}
