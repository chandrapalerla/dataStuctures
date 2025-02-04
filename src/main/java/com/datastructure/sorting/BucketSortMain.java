package com.datastructure.sorting;

import java.util.Random;

public class BucketSortMain {

	public static void main(String[] args) {

		int arr[] = new int[100];

		Random ran = new Random();
		for (int i = 0; i < 100; i++) {
			arr[i] = ran.nextInt(100) + 100;
		}
		// Passing this array to BucketSort method
		BucketSort bs = new BucketSort(arr);
		System.out.println("Array before Sorting: ");
		bs.printArray();
		bs.bucketSort();

		System.out.println("\n\nArray after Sorting: ");
		bs.printArray();

	}

}
