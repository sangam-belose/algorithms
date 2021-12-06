package com.belose.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * https://leetcode.com/problems/remove-element/
 */

public class RemoveDuplicatesSortedArray {

    public static void main(String[] args) {
       //System.out.println(new RemoveDuplicatesSortedArray().solution(new int[]{1,1,2}));
        //System.out.println(new RemoveDuplicatesSortedArray().solution(new int[]{0,0,1,1,1,2,2,3,3,4}));

        System.out.println(new RemoveDuplicatesSortedArray().solution(new int[]{1,1,2},1));
        System.out.println(new RemoveDuplicatesSortedArray().solution(new int[]{0,0,1,1,1,2,2,3,3,4}, 2));
    }

    public int solution(int [] nums) {
        int arrayLength = nums.length;
        if (arrayLength == 0 || arrayLength == 1)
            return arrayLength;
        int j = 0;
        for (int i = 0; i< arrayLength-1; i++) {
            if(nums[i] != nums[i+1]) {
                nums[j] = nums[i];
                j++;
                System.out.println(Arrays.toString(nums));
            }
        }
        nums[j++] = nums[arrayLength-1];
        System.out.println(Arrays.toString(nums));
        return j;
    }


    public int solution(int [] nums, int val) {
        int arrayLength = nums.length;
        if (arrayLength == 0 || arrayLength == 1)
            if (nums[0] == val)
                return 1;
            else
                return 0;

        int j = 0;
        for (int i = 0; i< arrayLength; i++) {
                if(nums[i] != val) {
                    nums[j] = nums[i];
                    j++;
                }
                System.out.println(Arrays.toString(nums));
        }
        return j;
    }

}
