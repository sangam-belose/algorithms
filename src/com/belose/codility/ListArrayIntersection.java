package com.belose.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayIntersection {

    public static void main(String[] args) {

        int [] arr1 = new int[]{1, 2, 4, 6, 8};
        int [] arr2 = new int[]{2, 5, 6, 7, 8};
        System.out.println(findInteraction(arr1, arr2));
    }

    public static List<Integer> findInteraction(int [] arr1, int [] arr2){
        int pointer1 = 0;
        int pointer2 = 0;
        List<Integer> results = new ArrayList<>();

        while (pointer1 < arr1.length && pointer2 < arr2.length){
            if(arr1[pointer1] == arr2[pointer2]) {
                results.add(arr1[pointer1]);
                pointer1++;
                pointer2++;
            } else {
                if(arr1[pointer1] < arr2[pointer2])
                    pointer1++;
                else
                    pointer2++;
            }
        }
        return results;
    }

}
