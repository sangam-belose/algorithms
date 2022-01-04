package com.belose.codility;

/**
 *
 */

import java.util.Arrays;

public class MinimumAbsoluteSum {

    public static void main(String[] args) {
        System.out.println(MinimumAbsoluteSum.findMinAbsSumOfTwo(new int[]{3, 4, 5, 9}));
        System.out.println(MinimumAbsoluteSum.findMinAbsSumOfTwo(new int[]{-22, 4, 5, 9}));
        System.out.println(MinimumAbsoluteSum.findMinAbsSumOfTwo(
                new int[]{-11, -9, -7, -2, -1, 3, 4, 5, 14, 17}));
        System.out.println(MinimumAbsoluteSum.findMinAbsSumOfTwo(new int[]{-22, 22, 4, 5,}));

        System.out.println("-------------------------using math function with less code------------------");

        System.out.println(MinimumAbsoluteSum.solutionUsingMathFunctions(new int[]{3, 4, 5, 9}));
        System.out.println(MinimumAbsoluteSum.solutionUsingMathFunctions(new int[]{-22, 4, 5, 9}));
        System.out.println(MinimumAbsoluteSum.solutionUsingMathFunctions(
                new int[]{-11, -9, -7, -2, -1, 3, 4, 5, 14, 17}));
        System.out.println(MinimumAbsoluteSum.solutionUsingMathFunctions(new int[]{-22, 22, 4, 5,}));
    }

    public static int findMinAbsSumOfTwo(int[] arr) {
        int resultSum = Integer.MAX_VALUE;

        int frontPointer = 0;
        int backPointer = arr.length - 1;

        Arrays.sort(arr);

        while (frontPointer <= backPointer) {
            int currentSum = arr[frontPointer] + arr[backPointer];

            if (currentSum == 0) {
                return 0;
            }
            if (currentSum > 0) {
                backPointer -= 1;
            } else {
                frontPointer += 1;
            }
            if (Math.abs(currentSum) < resultSum) {
                resultSum = Math.abs(currentSum);
            }

        }

        return resultSum;
    }

    public static int solutionUsingMathFunctions(int[] arr) {
        int resultSum = Integer.MAX_VALUE;

        int frontPointer = 0;
        int backPointer = arr.length - 1;

        Arrays.sort(arr);

        while (frontPointer <= backPointer) {
            resultSum = Math.min(resultSum, Math.abs(arr[frontPointer] + arr[backPointer]));

            if (arr[frontPointer] + arr[backPointer] < 0) {
                frontPointer += 1;
            } else {
                backPointer -= 1;
            }
        }
        return resultSum;

    }

}
