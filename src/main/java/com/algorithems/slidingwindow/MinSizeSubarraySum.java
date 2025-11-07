package com.algorithems.slidingwindow;

public class MinSizeSubarraySum {
    void main(String[] args) {

        int[] arr = {2, 1, 5, 2, 3, 2};
        int s = 7;
        System.out.println("Min size subarray length = " + minSizeSubarray(arr, s)); // Output: 2
    }

    private int minSizeSubarray(int[] arr, int s) {
        int sum = 0, minLen = Integer.MAX_VALUE, left = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum >= s) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}
