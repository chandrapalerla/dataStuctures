package com.algorithems.slidingwindow;

//Problem: Find the maximum sum of any subarray of size k. using Sliding Window Pattern
public class MaxSumSubarray {
    void main() {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Max sum = " + maxSum(arr, k)); // Output: 9
    }

    private int maxSum(int[] arr, int k) {

        int maxSum = 0, windowSum = 0, n = arr.length;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;
        for (int j = k; j < n; j++) {
            windowSum += arr[j] - arr[j - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
