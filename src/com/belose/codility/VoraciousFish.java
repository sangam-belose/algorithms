package com.belose.codility;

import java.util.Stack;

/**
 * https://app.codility.com/programmers/lessons/7-stacks_and_queues/fish/
 */
public class VoraciousFish {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0})); // 2

        System.out.println(solution(new int[]{4, 3, 2, 0, 5}, new int[]{0, 1, 0, 0, 0})); // 2

        System.out.println(solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0})); // 2

        System.out.println(solution(new int[]{4, 3, 2, 1, 5}, new int[]{1, 0, 1, 0, 1})); //3

        System.out.println(solution(new int[]{3}, new int[]{1})); // 1
    }

    public static int solution(int[] A, int[] B) {

        int surviorCount = 0;
        Stack<Integer> store = new Stack<>();

        for (int wieghtIndex = 0; wieghtIndex < A.length; wieghtIndex++) {
            int weight = A[wieghtIndex];
            if (B[wieghtIndex] == 1) {
                store.push(weight);
            } else {
                int weightDown = store.isEmpty() ? -1 : store.pop();

                while (weightDown != -1 && weightDown < weight) {
                    weightDown = store.isEmpty() ? -1 : store.pop();
                }
                if (weightDown == -1) {
                    surviorCount += 1;
                } else {
                    store.push(weightDown);
                }


            }
        }
        return surviorCount + store.size();

    }
}
