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
        System.out.println(solution(new int[]{3,4,3,2,3,-1,3,3}));  // 3
    }
    public static int solution(int[] A) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int item: A) {
            if(frequency.containsKey(item)) {
                frequency.put(item, frequency.get(item) + 1);
            } else {
                frequency.put(item, 1);
            }
        }

        int maxOccurence = Collections.max(frequency.values());

        if(maxOccurence > A.length / 2) {
           Optional<Integer> number =  frequency.entrySet().stream()
                    .filter(entry -> entry.getValue() == maxOccurence)
                    .map(Map.Entry::getKey)
                    .findFirst();
            return number.get();
        }

        return -1;
    }
}

