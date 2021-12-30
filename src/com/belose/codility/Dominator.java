package com.belose.codility;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * https://app.codility.com/programmers/lessons/8-leader/dominator/
 */
public class Dominator {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 3, 2, 3, -1, 3, 3}));  // 3

        // in codility dominator you need to return the index of dominator element.
        System.out.println(dominatorUsingConstantSpace(new int[]{3, 4, 3, 2, 3, -1, 3, 3}));  // 0

        System.out.println(dominatorUsingConstantSpace(new int[]{4,7,5,4,4, 4, 3, 2, 4, -1, 4, 4}));  // 4
    }

    public static int solution(int[] A) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int item : A) {
            if (frequency.containsKey(item)) {
                frequency.put(item, frequency.get(item) + 1);
            } else {
                frequency.put(item, 1);
            }
        }

        int maxOccurence = Collections.max(frequency.values());

        if (maxOccurence > A.length / 2) {
            Optional<Integer> number = frequency.entrySet().stream()
                    .filter(entry -> entry.getValue() == maxOccurence)
                    .map(Map.Entry::getKey)
                    .findFirst();
            return number.get();
        }

        return -1;
    }

    public static int dominatorUsingConstantSpace(int[] elements) {
        int consecutiveSize = 0;
        int candidate = 0;

        for (int item : elements) {
            if (consecutiveSize == 0) {
                candidate = item;
                consecutiveSize += 1;
            } else if (candidate == item) {
                consecutiveSize += 1;
            } else {
                consecutiveSize -= 1;
            }
        }
        int occurances = 0;
        int resultIndex = 0;
        for (int i = 0; i < elements.length; i++) {
            if (candidate == elements[i]) {
                occurances += 1;
                resultIndex = i;
            }
        }
        return  occurances > elements.length / 2 ? resultIndex : -1;
    }
}

