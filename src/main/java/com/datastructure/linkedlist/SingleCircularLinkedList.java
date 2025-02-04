package com.datastructure.linkedlist;

import com.datastructure.node.SingleNode;

public class SingleCircularLinkedList {

	private SingleNode head;
	private SingleNode tail;
	private int size;// denotes size of list

	public SingleNode createSingleLinkedList(int nodevlaue) {

		head = new SingleNode();

		SingleNode node = new SingleNode();
		node.setValue(nodevlaue);
		node.setNextValue(node);

		head = node;
		tail = node;

		size = 1;

		return head;

	}

	public boolean existsLinkedList() {
		// if head is not null retrun true otherwise return false
		return head != null;
	}

	public void insertInLinkedList(int nodeValue, int location) {
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		System.out.println("Inserting new node at location: " + location);
		if (!existsLinkedList()) {
			System.out.println("The linked list does not exist!!");
			return; // Linked List does not exists
		} else if (location == 0) {// insert a node first location
			node.setNextValue(head);
			head = node;
			tail.setNextValue(node);
		} else if (location >= size) {// insert a node last
			tail.setNextValue(node);
			tail = node;// to keep track of last node
			tail.setNextValue(head);// update tail to circularly point head

		} else {//// insert at specified location
			SingleNode tempNode = head;
			int index = 0;
			while (index < location - 1) {// loop till we reach specified node
				tempNode = tempNode.getNextValue();
				index++;
			} // insert new node after tempNode
			node.setNextValue(tempNode.getNextValue());
			tempNode.setNextValue(node);

		}
		size++;
	}

	// Traverse Linked List
	public void traverseLinkedList() {
		if (existsLinkedList()) {
			SingleNode tempNode = head;
			for (int i = 0; i < size; i++) {

				System.out.print(tempNode.getValue());
				if (i != size - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.getNextValue();
			}
			System.out.println("\n");
		} else {
			System.out.println("\nLinked List does not exists !");
		}
	}

	// Traverse Linked List
	public void printHeadUsingTail() {
		if (existsLinkedList()) {
			System.out.println("Printing Tail...");
			System.out.println(tail.getValue());

			System.out.println("Printing Head using Head reference...");
			System.out.println(head.getValue());

			System.out.println("Printing Head using Tail reference...");
			System.out.println(tail.getNextValue().getValue());

		} else {
			System.out.println("Linked List does not exists");
		}
	}

	// Search given value in Linked List
	public boolean searchNode(int nodeValue) {
		if (existsLinkedList()) {
			SingleNode tempNode = head;
			for (int i = 0; i < size; i++) {
				// System.out.print(tempNode.value);
				if (tempNode.getValue() == nodeValue) {
					System.out.print("Found the node at location: " + i);
					return true;
				}
				tempNode = tempNode.getNextValue();
			}
		}
		System.out.print("Node not found!! ");

		return false;
	}

	public void deletionOfNode(int location) {
		if (!existsLinkedList()) {
			System.out.println("The linked list does not exist!!");// Linked List does not exists
			return;

		} else if (location == 0) {
			head = head.getNextValue();
			tail.setNextValue(head);
			setSize(getSize() - 1);
			if (getSize() == 0) { // if there are no more nodes in this list
				tail = null;
			}

		}else if (location >= getSize()){ //If location is not in range or equal, then delete last node
			SingleNode tempNode = head;
			for (int i = 0; i < size - 1; i++) {
				tempNode = tempNode.getNextValue(); //temp node points to 2nd last node
			}
			if (tempNode == head) { //if this is the only element in the list
				tail = head = null;
				setSize(getSize()-1);
				return;
			}
			tempNode.setNextValue(head);; 
			tail= tempNode;
			setSize(getSize()-1);
			
		}else { //if any inside node is to be deleted
			SingleNode tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.getNextValue(); // we need to traverse till we find the location
			}	
			tempNode.setNextValue(tempNode.getNextValue().getNextValue()); // delete the required node
			setSize(getSize()-1);
		}//end of else

	}
	
	//Delete linked list
	public	void deleteLinkedList() {
			System.out.println("\n\nDeleting Linked List...");
			head = null;
			if(tail == null) {
				System.out.println("Linked List is already deleted, nothing to delete !");
				return;
			}else {
				tail.setNextValue(null);
				tail = null;
				System.out.println("Linked List deleted successfully !");
			}
		}
		

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
