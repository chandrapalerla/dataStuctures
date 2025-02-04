package com.datastructure.binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

import com.datastructure.node.BinaryNode;

public class BinarySearchTreeByLinkedList {

	BinaryNode root;

	public BinaryNode getRoot() {
		return root;
	}

	// Constructor
	BinarySearchTreeByLinkedList() {
		root = null;
	}

	// Insert values in BST
	void insert(int value) {
		root = insert(root, value);
	}

	private BinaryNode insert(BinaryNode currentNode, int value) {
		if (currentNode == null) {
			System.out.println("Successfully inserted " + value + " in BST");
			return createNode(value);
		} else if (value <= currentNode.getValue()) {
			currentNode.setLeft(insert(currentNode.getLeft(), value));
			return currentNode;
		} else {
			currentNode.setRight(insert(currentNode.getRight(), value));
			return currentNode;
		}
	}

	private BinaryNode createNode(int value) {
		BinaryNode node = new BinaryNode();
		node.setValue(value);
		return node;
	}

	public void printTreeGraphically() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		Queue<Integer> level = new LinkedList<Integer>();

		int CurrentLevel = 1;
		boolean previousLevelWasAllNull = false;
		queue.add(root);
		level.add(1);

		System.out.println("\nPrinting Level order traversal of Tree...");
		if (root == null) {
			System.out.println("Tree does not exists !");
			return;
		}

		while (!queue.isEmpty()) {
			if (CurrentLevel == level.peek()) { // if we are in the same level
				if (queue.peek() == null) {
					queue.add(null);
					level.add(CurrentLevel + 1);
				} else {
					queue.add(queue.peek().getLeft());
					level.add(CurrentLevel + 1);
					queue.add(queue.peek().getRight());
					level.add(CurrentLevel + 1);
					previousLevelWasAllNull = false;
				}
				System.out.print(queue.remove() + "  ");
				level.remove();
			} else { // level has changed
				System.out.println("\n");
				CurrentLevel++;
				if (previousLevelWasAllNull == true) {
					break;
				}
				previousLevelWasAllNull = true;
			}
		} // end of loop

	}

	// Search a node in BST
	public void searchForValue(int value) {
		searchForValue(root, value);
	}

	private BinaryNode searchForValue(BinaryNode node, int value) {
		if (node == null) {
			System.out.println("Value: " + value + " not found in BST.");
			return null;
		} else if (node.getValue() == value) {
			System.out.println("Value: " + value + " found in BST.");
			return node;
		} else if (value < node.getValue()) {
			return searchForValue(node.getLeft(), value);
		} else {
			return searchForValue(node.getRight(), value);
		}
	}

	public void deleteNodeOfBST(int value) {
		System.out.println("\n\nDeleting " + value + " from BST...");
		deleteNodeOfBST(root, value);

	}

	private BinaryNode deleteNodeOfBST(BinaryNode root, int value) {
		if (root == null) {
			System.out.println("Value not found in BST");
			return null;
		}
		if (value < root.getValue()) {
			root.setLeft(deleteNodeOfBST(root.getLeft(), value));
		} else if (value > root.getValue()) {
			root.setRight(deleteNodeOfBST(root.getRight(), value));
		} else { // If currentNode is the node to be deleted

			if (root.getLeft() != null && root.getRight() != null) { // if nodeToBeDeleted have both children
				BinaryNode temp = root;
				BinaryNode minNodeForRight = minimumElement(temp.getRight());// Finding minimum element from right
																				// subtree
				root.setValue(minNodeForRight.getValue()); // Replacing current node with minimum node from right
															// subtree
				root.setRight(deleteNodeOfBST(root.getRight(), minNodeForRight.getValue())); // Deleting minimum node
																								// from right now
			} else if (root.getLeft() != null) {// if nodeToBeDeleted has only left child
				root = root.getLeft();
			} else if (root.getRight() != null) {// if nodeToBeDeleted has only right child
				root = root.getRight();
			} else // if nodeToBeDeleted do not have child (Leaf node)
				root = null;
		}
		return root;

	}

	// Get minimum element in binary search tree
	public static BinaryNode minimumElement(BinaryNode root) {
		if (root.getLeft() == null)
			return root;
		else {
			return minimumElement(root.getLeft());
		}
	}// end of method
}
