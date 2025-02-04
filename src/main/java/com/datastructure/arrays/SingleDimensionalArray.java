package com.datastructure.arrays;

//Arrays operations

/*1.instantiation, 
2.initialization, 
3.inserting,updating, 
4.serching an cell,
5.searching an elemnet in array, 
6.deletion in cell, 
7. delete in array */

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		System.out.println("Creating a blank array of size 10...");
		SingleDimensional sd = new SingleDimensional(5);
		
		sd.traverseArray();
		
		System.out.println("----------------------------------");
		
		sd.insert(0, 10);
		sd.insert(1, 20);
		sd.insert(2, 30);
		sd.insert(3, 40);
		sd.insert(4, 50);
		sd.insert(1, 60);
		sd.insert(10, 60);
		
		System.out.println("--------------------------------------");
		
		sd.traverseArray();
		
		System.out.println("_______________________________________");
		
		sd.accessingCell(2);
		
		System.out.println("_________________________________________");
		
		sd.searchInAnArray(50);
		
		System.out.println("__________________________________________");
		
		sd.deleteValueFromArray(10);
		
		System.out.println("___________________________________________");
		
		sd.deleteArray();
		
		System.out.println("_____________________________________________");
		
		sd.traverseArray();
	}

}
