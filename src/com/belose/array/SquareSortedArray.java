package com.belose.array;

import java.util.Arrays;

/**
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * */
public class SquareSortedArray {

    public static void main(String[] args) {
       int[] nums = new int[]{-43,-10, -1,0,3,10};
        System.out.println(Arrays.toString(squareSorted(nums)));
    }

    public static int[] squareSorted(int [] nums) {
        int [] result = new int[nums.length];

        int startIndex = 0;
        int endIndex = nums.length -1;
        int i = endIndex;
        while (startIndex <= endIndex) {
            int startSqr = nums[startIndex] * nums[startIndex];
            int endSqr = nums[endIndex] * nums[endIndex];

            if(startSqr > endSqr) {
                result[i--] = startSqr;
                startIndex++;
            }else {
                result[i--] = endSqr;
                endIndex--;
            }
        }
        return result;
    }

}
