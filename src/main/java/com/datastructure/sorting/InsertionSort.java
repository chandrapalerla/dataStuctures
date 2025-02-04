package com.datastructure.sorting;

public class InsertionSort {

	public void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}// end of method

	public void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i], j = i;
			while (j > 0 && array[j - 1] > temp) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = temp;
		}

	}
}
