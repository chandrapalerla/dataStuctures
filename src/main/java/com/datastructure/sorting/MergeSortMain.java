package com.datastructure.sorting;

public class MergeSortMain {

	public static void main(String[] args) {
		int array[] = { 10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8 };
		int length = array.length;
		System.out.println("the array length is:::::" + length);

		MergeSort mergeSort = new MergeSort();

		System.out.println("printing array before sorting");
		mergeSort.printArray(array);

		// sort the elemrnts
		System.out.println();
		mergeSort.mergeSort(array, 0, length-1);

		System.out.println("\nAfter sorting: ");
		mergeSort.printArray(array);

	}

}
