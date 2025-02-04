package com.datastructure.recursion;

//0,1,1,2,3,5,8,13,21,34.....

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//Using Recursion Method
		int fibonacci = fibonacciSeries(6);
		System.out.println(fibonacci);
		

	}

	private static int fibonacciSeries(int i) {
		if(i== 0)
		 return 0;
		else if(i==1 || i==2)
			return 1;
		else
			return fibonacciSeries(i-1)+fibonacciSeries(i-2);
	}

}
