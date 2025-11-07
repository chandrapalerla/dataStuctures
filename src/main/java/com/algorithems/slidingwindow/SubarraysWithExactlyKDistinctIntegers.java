package com.algorithems.slidingwindow;

import java.util.HashMap;
import java.util.Map;

//Problem: Count subarrays that contain exactly k distinct integers.
//🧩 Hint: Count(at most k) - Count(at most k-1)
public class SubarraysWithExactlyKDistinctIntegers {
    void main(){
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;

        int result = countExactlyKDistinct(nums, k);
        System.out.println("Count of subarrays with exactly " + k + " distinct integers = " + result); // Output: 7
    }
    // Main function: count subarrays with EXACTLY k distinct integers
    public static int countExactlyKDistinct(int[] nums, int k) {
        if (k == 0) return 0;
        return countAtMostKDistinct(nums, k) - countAtMostKDistinct(nums, k - 1);
    }

    private static int countAtMostKDistinct(int[] nums, int k) {
        int left = 0, count = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);

            // If we have more than k distinct, shrink window
            while (freq.size() > k) {
                freq.put(nums[left], freq.get(nums[left]) - 1);
                if (freq.get(nums[left]) == 0)
                    freq.remove(nums[left]);
                left++;
            }

            // All subarrays ending at 'right' with at most k distinct
            count += right - left + 1;
        }

        return count;
    }
}
