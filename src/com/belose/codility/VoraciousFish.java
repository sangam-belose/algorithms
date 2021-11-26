    package com.belose.codility;

    import java.util.Stack;

    /**
     * https://app.codility.com/programmers/lessons/7-stacks_and_queues/fish/
     */
    public class VoraciousFish {

        public static void main(String[] args) {
            System.out.println(solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0})); // 2

            System.out.println(solution(new int [] { 4, 3, 2, 0, 5 }, new int [] { 0, 1, 0, 0, 0 })); // 2

            System.out.println(solution(new int [] { 4, 3, 2, 1, 5 }, new int [] { 0, 1, 0, 0, 0 })); // 2

            System.out.println(solution(new int[]{4, 3, 2, 1, 5}, new int[]{1, 0, 1, 0, 1})); //3

            System.out.println(solution(new int[]{3}, new int[]{1})); // 1
        }

        public static int solution(int[] A, int[] B) {
            int surviors = A.length;
            Stack<Integer> store = new Stack<>();
            for (int i = 0; i < A.length; i++) {
                int weight = A[i];
                if (B[i] == 1) {
                    store.push(weight);
                } else {
                    while (!store.isEmpty()) {
                        if (store.peek() > A[i]) {
                            surviors--;
                            break;
                        }
                        if (store.peek() < A[i]) {
                            surviors--;
                            store.pop();
                        }
                    }
                }
            }
            return surviors;
        }
    }
