package com.datastructure.recursion;

//Searching element in Arrays Using Recursion Method
public class ArraysSearching {
	static int biggest;

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 90, 50, 60, 70, 80 };

		int length = a.length - 1;
		
		int b = findBiggetstNumber(a, length);
		System.out.println(b);
	}

	private static int findBiggetstNumber(int[] a, int l) {
		if (l == -1) {
			return biggest;
		} else {
			if (a[l] > biggest) {
				biggest = a[l];
				return findBiggetstNumber(a, l - 1);
			} else {
				return findBiggetstNumber(a, l - 1);
			}
		}

	}

}
