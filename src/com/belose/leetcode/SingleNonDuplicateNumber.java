package com.belose.leetcode;

/**
 * https://leetcode.com/problems/single-number/
 * problem number 136
 */
public class SingleNonDuplicateNumber {

    public int solution(int [] nums) {
        int duplicate  = nums[0];
        for (int index = 1; index<nums.length; index++) {
            duplicate^=nums[index];
        }
        return duplicate;
    }

    public static void main(String[] args) {
        System.out.println(new SingleNonDuplicateNumber().solution(new int[] {1,2,3,1,2,4,3}));
    }

}
