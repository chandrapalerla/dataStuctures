package com.datastructure.binarySearchTree;

public class BinarySearchTreeByLinkedListMain {

	public static void main(String[] args) {

		BinarySearchTreeByLinkedList btree = new BinarySearchTreeByLinkedList();

		// Inserting values in BST
		System.out.println("Inserting 10 nodes in Tree");
		btree.insert(100);
		btree.insert(80);
		btree.insert(70);
		btree.insert(90);
		btree.insert(50);

		// btree.printTreeGraphically();
		// Searching non-existing value in Tree
		System.out.println("\n\nSearching for value on BST...");
		btree.searchForValue(80);

		// Searching existing value in Tree
		System.out.println("\nSearching for value on BST...");
		btree.searchForValue(60);

		// Deleting Node from Tree
		btree.deleteNodeOfBST(80); // Node does not exists

	}
}
