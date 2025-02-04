package com.datastructure.divideAndConquer;

import java.util.Scanner;

public class Fibonacci_DC {

	public static void main(String[] args) {
		Scanner sysIn = new Scanner(System.in);
		System.out.println("please enter a fibboccai number");
		int n = sysIn.nextInt();
		printFibbonacciSeries(n);
		
		System.out.println("");
		int fibonnacciNumber = fib(n);
		System.out.println("the fibbonacci number is::::" +fibonnacciNumber);

	}

	private static void printFibbonacciSeries(int n) {
		int n1=0,n2=1;
		
		System.out.print(n1+" "+n2);
		  for(int i=-0;i<n-2;i++) {
			 int  n3 = n1+n2;
			 System.out.print(" "+n3);
			 n1=n2;n2=n3;
		  }
		
	}

	private static int fib(int n) {
		if (n < 1) {
			System.out.println("please enter positive number");
		} else if (n == 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
		return -1;

	}

}
