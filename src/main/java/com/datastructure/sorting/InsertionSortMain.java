package com.datastructure.sorting;

public class InsertionSortMain {

	public static void main(String[] args) {

		InsertionSort insertionSort = new InsertionSort();
		int array[] = { 10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8 };

		System.out.println("User entered Array: ");
		insertionSort.printArray(array);

		long start = System.nanoTime();
		insertionSort.insertionSort(array);
		long end = System.nanoTime();
		System.out.println("\n\nTime to execute this algo: " + (end - start));

		System.out.println("\nAfter sorting: ");
		insertionSort.printArray(array);

	}

}
