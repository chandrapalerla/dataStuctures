package com.datastructure.sorting;

public class BubbleSortMain {

	public static void main(String[] args) {

		int arr[] = { 10, 5, 30, 15, 50, 6 };
		System.out.println("*** Array Printing Before sorting*******");
		BubbleSort bsort = new BubbleSort();
		bsort.printArray(arr);
		
		bsort.bubbleSort(arr);
		System.out.println("*****Array Printing after sorting********");
		bsort.printArray(arr);

	}

}
