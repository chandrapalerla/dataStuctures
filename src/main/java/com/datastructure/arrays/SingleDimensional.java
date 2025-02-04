package com.datastructure.arrays;

public class SingleDimensional {

	int arr[] = null;

	// create a contructor with default values array size is 5
	public SingleDimensional(int sizeArray) {
		arr = new int[sizeArray];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
		System.out.println(arr[0]);
	}

	// Print the array
	public void traverseArray() {
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Array of elements is" + arr[i]);
			}
		} catch (Exception e) {
			System.out.println("array is not exist");
		}
	}

	// Insert value in the Array
	public void insert(int location, int valueToBeInserted) {
		try {
			if (arr[location] == Integer.MIN_VALUE) {
				arr[location] = valueToBeInserted;
			}
			System.out.println("Successfully inserted " + valueToBeInserted + " at location: " + location);
		} catch (Exception e) {
			System.out.println("This cell is already occupied by another value.");
		}
	}

	// Access a particular element of an array
	public void accessingCell(int cellNumber) {
		try {

			System.out.println("the element is::::" + arr[cellNumber]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array !");
		}
	}
	
	//Search for an element in the given Array
	public void searchInAnArray(int valueToSearch) {
		
		try {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==valueToSearch) {
					System.out.println("Value found !");
					System.out.println("Index of " + valueToSearch + " is: " + i);
					return;
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Delete value from given Array
	public void deleteValueFromArray(int deleteValueFromThisCell) {
		
		try {
			arr[deleteValueFromThisCell] = Integer.MIN_VALUE;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Cant delete the value as cell# provided is not in the range of array !");
		}
	}
	
	//delete entire array
	public void deleteArray(){
		arr = null;
		System.out.println("Array has been succefully deleted");
	}
}
