package com.belose.codility;

import java.util.Arrays;

/**
 * https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
 */
public class MaxCounters {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{3, 4, 4, 6, 1, 4, 4})));

        System.out.println(Arrays.toString(fastSolution(5, new int[]{3, 4, 4, 6, 1, 4, 4})));
    }

    // Quadratic complexity
    public static int[] solution(int number, int[] arr) {

        int results[] = new int[number];
        int maxCounter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number + 1) {
                for (int j = 0; j < results.length; j++) {
                    results[j] = maxCounter;
                }
            } else {
                int resultIndex = arr[i] - 1;
                results[resultIndex] += 1;

                if (results[resultIndex] > maxCounter) {
                    maxCounter = results[resultIndex];
                }
            }

        }
        return results;
    }

    public static int[] fastSolution(int number, int[] arr) {
        int results [] = new int[number];
        Arrays.fill(results, 0);
        int startLine = 0;
        int maxCounter = 0;
        for(int i: arr) {
            int x = i-1;
            if(i > number) startLine = maxCounter;
            else if(results[x] < startLine) results[x] = startLine+1;
            else results[x] +=1;

            if(i<=number && results[x] > maxCounter)
                maxCounter = results[x];
        }

        for(int i=0; i<results.length; i++)
            if(results[i] < startLine) results[i] = startLine;

            return results;
    }
}
