package com.belose.codility.zalando;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IdneticalPair {

public int solution(int[] A) {
        Map<Integer,Long> map=  Arrays.stream(A)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int result = map.entrySet()
                .stream()
                .mapToInt(IdneticalPair:: countPair)
                .sum();
        return result;
    }

    private static int countPair(Map.Entry<Integer, Long> entry) {
        return ((entry.getValue().intValue()-1)) * entry.getValue().intValue() / 2;
    }


}

