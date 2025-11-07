package com.algorithems.slidingwindow;

//Problem: Find the subarray of size k with the highest average.
//🧩 Hint: Similar to max-sum, but divide by k at the end.
public class MaximumAverageSubarrayOfSizeK {
    void main(){
        int a[] = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println("Max Average = " + findMaxAverage(a,k)); // Output: 12.75
    }

    private double findMaxAverage(int[] a, int k) {
        int windowSum=0;
        int maxSum=0;
        for(int i=k;i<k;i++){
            windowSum+=a[i];
        }
        maxSum = windowSum;
        for(int j = k;j<a.length;j++){
            windowSum+=a[j]-a[j-k];
            maxSum = Math.max(maxSum,windowSum);
        }
        return maxSum/k;
    }

}
