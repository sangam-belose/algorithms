package com.belose.codility;

/**
 * https://app.codility.com/programmers/lessons/15-caterpillar_method/count_distinct_slices/
 */

public class DistinctSlices {

    public static void main(String[] args) {
        System.out.println(DistinctSlices.findDistinctSlicesCount(6, new int[]{3, 4, 5, 5, 2}));
    }

    public static int findDistinctSlicesCount(int maxBound, int[] arr) {

        int head = 0;
        int sliceCount = 0;

        boolean[] lookup = new boolean[maxBound + 1];
        for (int tail = 0; tail < arr.length; tail++) {
            while (head < arr.length && !lookup[arr[head]]) {
                lookup[arr[head]] = true;
                sliceCount += (head - tail) + 1;
                head += 1;

                // max limit
                if (sliceCount > 1000000000) {
                    return 1000000000;
                }
            }
            lookup[arr[tail]] = false;
        }

        return sliceCount;

    }

}
