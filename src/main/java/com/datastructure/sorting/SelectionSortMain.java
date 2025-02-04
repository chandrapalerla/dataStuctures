package com.datastructure.sorting;

public class SelectionSortMain {

	public static void main(String[] args) {
		int array[] = { 10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8 };

		System.out.println("User entered Array: ");
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.printArray(array);

		selectionSort.selectionSort(array);

		System.out.println("\n\nAfter sorting: ");
		selectionSort.printArray(array);

	}

}
