package com.belose.common;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {

    public static void main(String[] args) {
        int [] arr = {4,3,8,7,5,2,6};

        System.out.println(findMissingNumber(arr));

    }

    static int findMissingNumber(int[] arr) {
        // add one as one num is missing.
        int n = arr.length+1;

        int expectedSum = n * (n+1) /2;

        int actualSum = Arrays.stream(arr).sum();

        return expectedSum - actualSum;
    }

}
