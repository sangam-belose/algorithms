package com.belose.array;

/**
 * Duplicates in an array problem overview The problem is that we want to find duplicates in a T[]
 * one-dimensional array of integers in O(N) running time where the integer values are smaller than
 * the length of the array - and we can not use negative values!
 */
public class ArrayDuplicate {

    public static void main(String[] args) {
        int []arr = new int[]{0, 3, 2, 4, 3, 1};
        ArrayDuplicate.findDuplicateNumbers(arr);
    }

    public static void findDuplicateNumbers(int[] arr) {
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = Math.abs(arr[i]);
            if (num == 0) {
                zeroCount +=1;
            }
            if (arr[num] >= 0) {
                arr[num] = -arr[num];
            } else {
                System.out.println(num + " is duplicate number");
            }
        }
        if(zeroCount >= 2)
            System.out.println("0 is duplicate number");
    }

}
