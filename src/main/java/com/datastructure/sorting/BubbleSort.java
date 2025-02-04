package com.datastructure.sorting;

public class BubbleSort {

	public void printArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}

	}

	public void bubbleSort(int[] arr) {
		int n = arr.length;
		System.out.println("the length is::::" + n);

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

}
