package com.algorithems.twopointers;

public class TwoSum {
    void main() {
        int[] arr = {2, 3, 4, 15};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]); // Output: Indices: 0, 1
    }

    private int[] twoSum(int[] arr, int target) {
        int left = 1;
        int right = arr.length;
        while (left < right) {
            int sum = arr[left-1] + arr[right-1];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            }
        }
        return new int[]{-1, -1}; // Not found
    }
}
