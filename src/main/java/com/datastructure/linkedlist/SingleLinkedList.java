package com.datastructure.linkedlist;

import com.datastructure.node.SingleNode;

public class SingleLinkedList {

	private SingleNode head;

	private SingleNode tail;

	private int size;// denotes size of list

	public SingleNode getHead() {
		return head;
	}

	public void setHead(SingleNode head) {
		this.head = head;
	}

	public SingleNode getTail() {
		return tail;
	}

	public void setTail(SingleNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public SingleNode createSingleLinkedList(int nodeValue) {
		head = new SingleNode();
		// create a blank node
		SingleNode node = new SingleNode();

		// Assigne to the node value to blank node and nextValue is null
		node.setValue(nodeValue);
		node.setNextValue(null);

		// Assige the the head is node and tail is node
		head = node;
		tail = node;
		size = 1;// size =1
		return head;

	}

	public boolean existsLinkedList() {
		// if head is not null retrun true otherwise return false
		return head != null;
	}

	// Traverses Linked List
	public void traverseLinkedList() {
		if (existsLinkedList()) {
			SingleNode tempNode = head;
			for (int i = 0; i < getSize(); i++) {
				System.out.print(tempNode.getValue());
				if (i != getSize() - 1) {
					System.out.print(" -> ");
				}
				// Traverse the next node reference
				tempNode = tempNode.getNextValue();
			}

		} else {
			System.out.println("Single linked list not exist");
		}

		System.out.println("\n");

	}

	// insert mode value in
	public void insertInLinkedList(int nodeValue, int location) {
		// create a blank node
		SingleNode node = new SingleNode();
		// set the node value
		node.setValue(nodeValue);
		if (!existsLinkedList()) {
			System.out.println("Single linked list not exist");
			return;
		} else if (location == 0) {// insert node in first position
			node.setNextValue(head);
			head = node;
		} else if (location >= size) {// insert node last position
			node.setNextValue(null);
			tail.setNextValue(node);
			tail = node;
		} else {
			// insert at specified location
			SingleNode tempNode = head;
			int index = 0;
			while (index < location - 1) {// loop till we reach specified node
				tempNode = tempNode.getNextValue();
				index++;
			} // tempNode currently references to node after which we should insert new node
			SingleNode nextNode = tempNode.getNextValue(); // this is the immediate next node after new node
			tempNode.setNextValue(node);// update reference of tempNode to reference to new node
			node.setNextValue(nextNode);// update newly added nodes' next.

		}
		setSize(getSize() + 1);
	}

	public boolean searchNode(int nodeValue) {
		if (existsLinkedList()) {
			SingleNode tempNode = head;
			for (int i = 0; i < getSize() - 1; i++) {
				if (tempNode.getValue() == nodeValue) {
					System.out.print("Found the node at location: " + i + "\n");
					return true;
				}
				tempNode = tempNode.getNextValue();
			}

		}
		return false;
	}

	// Deletes a node having a given value
	public void deletionOfNode(int location) {
		if (!existsLinkedList()) {
			System.out.println("The linked list does not exist!!");// Linked List does not exists
			return;
		}else if (location == 0) { // we want to delete first element
			head = head.getNextValue();
			setSize(getSize()-1);
			if(getSize() == 0) { // if there are no more nodes in this list
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
			tempNode.setNextValue(null);; 
			tail= tempNode;
			setSize(getSize()-1);
			
		}else { //if any inside node is to be deleted
			SingleNode tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.getNextValue(); // we need to traverse till we find the location
			}	
			tempNode.setNextValue(tempNode.getNextValue().getNextValue()); // delete the required node
			setSize(getSize()-1);
		}

	}
	
	//Deletes entire Linked List
		void deleteLinkedList() {
			System.out.println("\n\nDeleting Linked List...");
			head = null;
			tail = null;
			System.out.println("Linked List deleted successfully !");
		}

}
