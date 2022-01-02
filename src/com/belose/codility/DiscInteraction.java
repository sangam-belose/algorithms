package com.belose.codility;

import java.util.Arrays;

public class DiscInteraction {

    public static void main(String[] args) {
        System.out.println(DiscInteraction.getNumOfDiscInteractions(new int[]{1, 5, 2, 1, 4, 0}));
    }

    public static int getNumOfDiscInteractions(int A[]) {
        long starts[] = new long[A.length];
        for (int i = 0; i < A.length; i++) {
            int radius = A[i];

            int startPos = i - radius;
            if (startPos < 0) {
                startPos = 0;
            }
            starts[startPos]++;
        }
        System.out.println(Arrays.toString(starts));

        long total = 0;

        for (int i = 0; i < starts.length; i++) {
            total += starts[i];
            starts[i] = total;
        }

        long totalInteractions = 0;
        for(int i =0;i<A.length; i++){

            int radius = A[i];
            long startPos = starts[i];
            long endPos = i+radius;

            if(endPos > A.length-1)
                endPos = A.length-1;

            long interaction = Math.max(starts[i], starts[(int)endPos]) - (i+1);
            totalInteractions += interaction;

            if(totalInteractions > 10000000)
                return -1;
        }

        return (int)totalInteractions;
    }

}
