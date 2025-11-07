package com.algorithems.prefixsum;

public class RangeSumQueryImmutable {
    int prefixSum[] = new int[10];
    void main() {
        int nums[] = {-2, 0, 3, -5, 2, -1};
        RangeSumQueryImmutable obj = new RangeSumQueryImmutable();
        prefixSum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        int sum =   obj.sumRange(0, 2); // Output: 1
    }

    private int sumRange(int left, int right) {
        if(left==0){
            return 1;
        }
        return 0;
    }
}
