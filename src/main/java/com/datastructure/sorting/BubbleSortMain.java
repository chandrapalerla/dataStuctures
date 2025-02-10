package com.datastructure.sorting;

public class BubbleSortMain {

	public static void main(String[] args) {

		int[] arr = { 10, 5, 30, 15, 50, 6 };
		System.out.println("*** Array Printing Before  ascendingOrder*******");
		BubbleSort ascendingOrder = new BubbleSort();
		ascendingOrder.printArray(arr);

		System.out.println("********* Accessing Order ***********");
		ascendingOrder.ascendingOrderSort(arr);
		System.out.println("*****Array Printing after ascendingOrder********");
		ascendingOrder.printArray(arr);

		System.out.println();
		int[] arr1 = { 10, 5, 30, 15, 50, 6 };
		System.out.println("*** Array Printing Before descendingOrder*******");
		BubbleSort descendingOrder = new BubbleSort();
		System.out.println();
		descendingOrder.printArray(arr1);

		descendingOrder.descendingOrderSort(arr1);
		System.out.println("*****Array Printing after descendingOrder********");
		descendingOrder.printArray(arr1);

	}

}
