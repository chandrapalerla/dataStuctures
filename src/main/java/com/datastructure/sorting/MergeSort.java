package com.datastructure.sorting;

public class MergeSort {

	public void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);

		}
	}

	public void mergeSort(int[] array, int left, int right) {
		if (right > left) {
			int mid = (left + right) / 2;
			System.out.println("the mid element is::::" + mid);
			mergeSort(array, left, mid);
			mergeSort(array, mid+1, right);
			merge(array,left,mid,right);
		}

	}

	private void merge(int[] array, int left, int middle, int right) {
		int [] leftTmpArray = new int[middle-left+2];  //Create tmp arrays
		int [] rightTmpArray = new int[right-middle+1];
		
		for(int i=0;i<=middle-left;i++) //Copy values from Array 'A' to these tmp arrays
			leftTmpArray[i]= array[left+i];
		for(int i=0;i<right-middle;i++)
			rightTmpArray[i]= array[middle+1+i];
		
		leftTmpArray[middle-left+1]= Integer.MAX_VALUE; //Merge values and insert into Array 'A'
		rightTmpArray[right-middle] = Integer.MAX_VALUE;
		int i = 0, j = 0;
		for (int k = left; k <= right; k++) {
			if (leftTmpArray[i] < rightTmpArray[j]) {
				array[k] = leftTmpArray[i];
				i++;
			} else {
				array[k] = rightTmpArray[j];
				j++;
			}
		}
		
	}

}
