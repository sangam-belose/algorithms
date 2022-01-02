package com.belose.codility;

import java.util.Arrays;

/**
 * https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_profit/
 */
public class MaxProfit {

    public static void main(String[] args) {
        System.out.println(
                new MaxProfit().solution(new int[]{23171, 21011, 21123, 21366, 21013, 21367}));

        System.out.println(Arrays.toString(new MaxProfit().findBuyAndSellPrice(
                new int[]{21000, 21011, 21123, 21366, 21013, 21367, 21361})));

    }

    public int solution(int[] nums) {

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            int delta = nums[i] - nums[i - 1];
            currentSum = Math.max(delta, currentSum + delta);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

    public int[] findBuyAndSellPrice(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int startIndex = 1;
        int endIndex = 1;

        //if this is made 1 it skip first value in certain cases
        int startIndexforNow = 0;

        for (int i = 1; i < nums.length; i++) {

            int delta = nums[i] - nums[i - 1];

            currentSum += delta;

            if (currentSum > maxSum) {
                maxSum = currentSum;
                startIndex = startIndexforNow;
                endIndex = i + 1;
            }

            if (currentSum < 0) {
                startIndexforNow = i;
                currentSum = 0;
            }
        }
        System.out.println(maxSum);
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, startIndex, endIndex)));
        return new int[]{nums[startIndex], nums[endIndex - 1]};
    }
}
