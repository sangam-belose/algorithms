package com.belose.array;

public class MaxSubarraySum {

    public static void main(String[] args) {
        int [] input = new int [] {-2,-1, -4, -1,-2};
        System.out.println(MaxSubarraySum.maxSubArray(input));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i <nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }

}
