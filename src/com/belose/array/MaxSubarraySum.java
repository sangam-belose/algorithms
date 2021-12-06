package com.belose.array;

import java.util.Arrays;

public class MaxSubarraySum {

    public static void main(String[] args) {
        int[] input = new int[]{-2, -1, -4, -1, -2};
        System.out.println(MaxSubarraySum.maxSubArray(input));

        System.out.println("Getting indexes: " + Arrays.toString(
                MaxSubarraySum.maxSubArrayPrintIndexes(input)));

        System.out.println(MaxSubarraySum.maxSubArray(new int[]{7, -8, 4, -1, 6, -2, 3, -6, 5}));

        System.out.println("Getting indexes: " + Arrays.toString(
                MaxSubarraySum.maxSubArrayPrintIndexes(new int[]{7, -8, 4, -1, 6, -2, 3, -6, 5})));


    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            System.out.println("currentSum: " + currentSum);
            maxSum = Math.max(currentSum, maxSum);

            System.out.println("maxSum: " + maxSum);
        }

        return maxSum;
    }

    public static int[] maxSubArrayPrintIndexes(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        int maxSubArrayStartIndex = 0;
        int maxSubArrayEndIndex = 0;
        int maxStartIndexUntilNow = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxSubArrayStartIndex = maxStartIndexUntilNow;
                maxSubArrayEndIndex = i;

            }
            if (currentSum < 0) {
                maxStartIndexUntilNow = i + 1;
                currentSum = 0;
            }
        }

        if (maxSubArrayStartIndex == maxSubArrayEndIndex) {
            return new int[]{nums[maxSubArrayStartIndex]};
        } else {
            return Arrays.copyOfRange(nums, maxSubArrayStartIndex, maxSubArrayEndIndex+1);
        }
    }


}
