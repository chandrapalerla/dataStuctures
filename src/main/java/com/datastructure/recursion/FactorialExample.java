package com.datastructure.recursion;

public class FactorialExample {

	public static void main(String[] args) {
		
		//Using Recursion Method
		int fact = factorial(5);
		System.out.println(fact);
	}

	private static int factorial(int i) {
		if(i<0)
			return 0;
		else if(i>0) 
			return i*(factorial(i-1));
		
		return 1;
		
	}

}
