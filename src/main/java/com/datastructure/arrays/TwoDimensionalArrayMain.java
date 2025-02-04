package com.datastructure.arrays;

public class TwoDimensionalArrayMain {

	public static void main(String[] args) {
		
		System.out.println("***********start TwoDimensionalArray*******************");
		TwoDimensionalArray td = new TwoDimensionalArray(2,2);
		System.out.println("_____traverseArray_____________");
		td.traverseArray();
		System.out.println("*************insertValueInTheArray************************");
		td.insertValueInTheArray(0, 0, 10);
		td.insertValueInTheArray(0, 1, 20);
		td.insertValueInTheArray(1, 0, 30);
		td.insertValueInTheArray(1, 1, 40);
		
		System.out.println("_____traverseArray_____________");
		td.traverseArray();
		
		System.out.println("************accessValueInTheArray***********");
		td.accessValueInTheArray(1, 1);
		
		System.out.println("*******************searchInAnArray***************");
		td.searchInAnArray(60);
		
		System.out.println("********deleteValuefromArray**********************");
		td.deleteValuefromArray(0, 1);
		
		System.out.println("*****************deleteThisArray*******************");
		td.deleteThisArray();
		
		System.out.println("_____traverseArray_____________");
		td.traverseArray();
		
		
		
		System.out.println("***********End TwoDimensionalArray*******************");
		

	}

}
