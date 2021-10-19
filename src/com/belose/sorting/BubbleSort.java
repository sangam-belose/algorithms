package com.belose.sorting;

import com.belose.array.ArrayDuplicates;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BubbleSort {

    public static void main(String[] args) {
        int [] arr = new int[]{6, 20, 8, 19, 56, 23, 87, 41, 49, 53};

        sort(arr);
    }

    private static void sort(int[] arr) {
        for (int i=0; i< arr.length; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
