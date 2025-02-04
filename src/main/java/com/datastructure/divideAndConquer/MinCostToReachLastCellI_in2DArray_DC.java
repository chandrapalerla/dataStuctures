package com.datastructure.divideAndConquer;

public class MinCostToReachLastCellI_in2DArray_DC {

	public static void main(String[] args) {
		int[][] array = { { 4, 7, 8, 6, 4 }, { 6, 7, 3, 9, 2 }, { 3, 8, 1, 2, 4 }, { 7, 1, 7, 3, 7 },
				{ 2, 9, 8, 9, 3 } };
		MinCostToReachLastCellI_in2DArray_DC min = new MinCostToReachLastCellI_in2DArray_DC();
		System.out.println(min.findMinCost(array, array.length - 1, array[0].length - 1));
	}

	private int findMinCost(int[][] array, int rows, int cols) {
		
		if (rows == -1 || cols == -1) {  //BASE CASE
			
			return Integer.MAX_VALUE;
		}
		if (rows == 0 && cols == 0) { //BASE CASE: If we're at first cell (0, 0),then no need to recurse
			return array[0][0];
		}

		int mincost1 = findMinCost(array, rows - 1, cols);// Case#1 Get min cost if we go 'up' from current cell
		int mincost2 = findMinCost(array, rows, cols - 1);// Case#2 Get min cost if we go 'left' from current cell

		int mincost = Integer.min(mincost1, mincost2);
		int currentCellsCost = array[rows][cols];
		return mincost + currentCellsCost;

	}

}
