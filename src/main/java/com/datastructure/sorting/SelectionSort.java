package com.datastructure.sorting;

public class SelectionSort {

	public void printArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}

	}

	public void selectionSort(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int minIdex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIdex])
					minIdex = j;
			}
			if (minIdex != i) {
				int temp = arr[i];
				arr[i] = arr[minIdex];
				arr[minIdex] = temp;
			}
		}

	}

}
