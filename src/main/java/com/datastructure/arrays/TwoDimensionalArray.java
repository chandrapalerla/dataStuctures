package com.datastructure.arrays;

public class TwoDimensionalArray {

	int arr[][] = null;

	// contructor
	public TwoDimensionalArray(int rows, int cols) {
		this.arr = new int[rows][cols];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}

	}

	// Traverse of array
	public void traverseArray() {
		try {
			for (int row = 0; row < arr.length; row++) {
				for (int col = 0; col < arr[row].length; col++) {
					System.out.println(arr[row][col]);
				}
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println("Array does not exists");
		}

	}

	// insert 2d Array
	public void insertValueInTheArray(int rowIndex, int colIndex, int value) {
		try {
			if (arr[rowIndex][colIndex] == Integer.MIN_VALUE) {
				arr[rowIndex][colIndex] = value;
				System.out.println(
						"value is inserted success with index" + rowIndex + "" + colIndex + " value is:::" + value);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid indes to access array");
		}
	}

	// Access a particular element of an array

	public void accessValueInTheArray(int rowIndex, int colIndex) {
		try {
			System.out.println(arr[rowIndex][colIndex]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array !");
		}
	}

	// Searching element in 2D array
	public void searchInAnArray(int valueToSearch) {

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == valueToSearch) {
					System.out.println("Element is found with index:: row:::" + row + "col::" + col);
					return;
				}

			}
		}
		System.out.println("Value is not found in Array\n");

	}
	
	// Deleting a value from Array
		public void deleteValuefromArray(int deleteValueFromThisRow, int deleteValueFromThisCol) {
			System.out.println(
					"Deleting value from Row#" + deleteValueFromThisRow + " & Col#" + deleteValueFromThisCol + "...");
			try {
				System.out.println("Successfully deleted: " + arr[deleteValueFromThisRow][deleteValueFromThisCol]);
				arr[deleteValueFromThisRow][deleteValueFromThisCol] = Integer.MIN_VALUE;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println();
				System.out.println("Cant delete the value as cell# provided is not in the range of array !");
				// e.printStackTrace();
			}
		}
		
		
		// Delete the entire Array
		public void deleteThisArray() {
				arr = null;
				System.out.println("Array has been succefully deleted");
		}

}
