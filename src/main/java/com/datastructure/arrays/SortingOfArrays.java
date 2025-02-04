package com.datastructure.arrays;

public class SortingOfArrays {

	static int arr[] = new int[] { 1, 7, 6, 4, 5 ,3, 2};
	static int inversionCount = 0;

	public static void main(String[] args) {

		System.out.println("::::::::::::::::::::Array of elements before sorting::::::::::::::::");
		
		// Traverse of arrays
		traverseArray(arr);

		// Sorting of arrays
		sortingOfArrays(arr);
		
		System.out.println("::::::::::::::::::::Array of elements after sorting::::::::::::::::");
		// Traverse of arrays
		traverseArray(arr);
		
		System.out.println("********inversionCount********" +inversionCount);
	}

	private static void traverseArray(int[] arr2) {

		for (int i = 0; i < arr2.length; i++) {

			System.out.println("Elemnts is:::::" + arr2[i]);
		}

	}

	private static void sortingOfArrays(int[] array) {

		try {

			for (int i = 0; i < array.length; i++) {

				for (int j = i + 1; j < array.length; j++) {
					if (array[i] > array[j]) {
						inversionCount++;
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;

					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
