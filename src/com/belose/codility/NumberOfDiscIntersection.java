package com.belose.codility;

import java.util.Arrays;

/**
 * https://app.codility.com/programmers/lessons/6-sorting/number_of_disc_intersections/
 * Ref: https://www.youtube.com/watch?v=oftWtDiA0M0
 */

public class NumberOfDiscIntersection {

    public int solution(int [] A) {

        //calculate start position
        int [] starts = new int[A.length];
        for (int i = 0; i<A.length; i++) {
            int radius = A[i];
            int startPos = i-radius;
            if(startPos < 0) {
                startPos = 0;
            }
            starts[startPos]++;
        }
        int total= 0;
        for (int i = 0; i<starts.length; i++){
            total+= starts[i];
            starts[i] = total;
        }

        //calculate end position
        int totalInteractions = 0;
        for(long i = 0; i<A.length; i++) {
            long radius = A[(int)i];
            long endPos = i+radius;
            if(endPos > A.length-1) {
                endPos = A.length-1;
            }
            int interactions = (int) (Math.max(starts[(int)i], starts[(int)endPos])-(i+1));
            totalInteractions+=interactions;

            if(totalInteractions > 10000000) {
                return -1;
            }
        }
        return totalInteractions;
    }
    public static void main(String[] args) {
        System.out.println(new NumberOfDiscIntersection().solution(new int[] {1,5,2,1, 4,0}));
    }
}