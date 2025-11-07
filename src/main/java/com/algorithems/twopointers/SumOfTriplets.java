package com.algorithems.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfTriplets {
    void main() {
        int[] arr = {1, 2, 4, 5, 6, 8, 9};
        int target = 17;
        findTriplets(arr, target);
    }

    private void findTriplets(int[] arr, int target) {
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    System.out.println("Triplet: " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            // skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // since we want target == 0, if current number > 0 no triplet can sum to 0
            if (nums[i] > 0) {
                break;
            }

            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    // skip duplicates for left
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    // skip duplicates for right
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}