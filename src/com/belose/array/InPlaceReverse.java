package com.belose.array;

import java.util.Arrays;

/**
 * The problem is that we want to reverse a T[] array in O(N) linear time complexity and we want the
 * algorithm to be in-place as well - so the algorithm can not use additional memory!
 * <p>
 * For example: input is [1,2,3,4,5] then the output is [5,4,3,2,1]
 */

public class InPlaceReverse {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr3 = new int[]{1};

        System.out.println("--------Using while loop------------");
        InPlaceReverse.usingWhile(arr1);
        InPlaceReverse.usingWhile(arr2);
        InPlaceReverse.usingWhile(arr3);

        int[] arr4 = new int[]{1, 2, 3, 4, 5};
        int[] arr5 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr6 = new int[]{1};
        System.out.println("--------Using For loop------------");
        InPlaceReverse.usingForLoop(arr4);
        InPlaceReverse.usingWhile(arr5);
        InPlaceReverse.usingWhile(arr6);
    }

    public static int[] usingWhile(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex <= endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static int[] usingForLoop(int[] arr) {
        int j = arr.length - 1;
        for (int i = 0; i <= j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

}
