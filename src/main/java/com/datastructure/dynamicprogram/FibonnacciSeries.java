package com.datastructure.dynamicprogram;

import java.util.Scanner;

public class FibonnacciSeries {

	public static void main(String[] args) {

		Scanner sysIn = new Scanner(System.in);

		int n = sysIn.nextInt();

		printFibonnaciSeries(n);

		System.out.println();

		System.out.println("finding nth fibonnaci number");

		Scanner sys = new Scanner(System.in);

		int n1 = sys.nextInt();

		System.out.println("the fibonnaci number is using Divide and conquer:::::" + findFibonnaciNumber(n1));
		int[] memoize = null;
		System.out.println("the fibonnaci number is using DP top down  ::::" + findFibonnaciNumberTopDown(memoize, n1));

		System.out.println("the fibonnaci number is using DP Bottom Up  ::::" + findFibonnaciNumberBottomUp(n1));

	}

	private static int findFibonnaciNumberBottomUp(int n1) {
		int table[] = new int[n1];
		
		if (n1 < 1)
			System.out.println("please enter positive number");

		table[0] = 0;

		table[1] = 1;

		for (int i = 2; i < n1; i++) {
			table[i] = table[i - 1] + table[i - 2];
		}
		return table[n1 - 1];
	}

	// Divide and conquer Method
	private static int findFibonnaciNumber(int n1) {
		// base condition
		if (n1 < 1)
			System.out.println("please enter positive number");
		else if (n1 == 1)
			return 0;
		else if (n1 == 2)
			return 1;
		else {
			return findFibonnaciNumber(n1 - 1) + findFibonnaciNumber(n1 - 2);
		}

		return -1;

	}

	// Dynamic Programming top down approach
	private static int findFibonnaciNumberTopDown(int[] memoize, int n1) {
		// specific to dynamic program top down approach
		memoize = new int[n1];
		// base condition
		if (n1 < 1)
			System.out.println("please enter positive number");
		else if (n1 == 1)
			return 0;
		else if (n1 == 2)
			return 1;
		// business logic
		if (memoize[n1 - 1] == 0) {
			memoize[n1 - 1] = findFibonnaciNumberTopDown(memoize, n1 - 1) + findFibonnaciNumberTopDown(memoize, n1 - 2);
		}

		return memoize[n1 - 1];

	}

	// Pring Fibonnaci series
	private static void printFibonnaciSeries(int n) {

		int c1 = 0, c2 = 1;
		int c3;
		System.out.print(c1 + " " + c2);
		while (n > 2) {
			c3 = c1 + c2;
			c1 = c2;
			c2 = c3;
			System.out.print(" " + c3);
			n--;
		}

	}

}
