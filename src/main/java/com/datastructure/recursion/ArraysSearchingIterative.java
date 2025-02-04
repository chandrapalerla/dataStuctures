package com.datastructure.recursion;

public class ArraysSearchingIterative {
	static int biggetst;

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 90, 50, 60, 70, 80 };

		int length = a.length;

		int b = findBiggetstNumber(a, length);
		System.out.println(b);
	}

	private static int findBiggetstNumber(int[] a, int length) {

		for (int i = 0; i < length - 1; i++) {
			int temp = a[0];
			for (int j = i + 1; j < length - 1; j++) {
				if (a[j] > temp) {
					biggetst = a[j];
				}
			}
		}
		return biggetst;
	}

}
