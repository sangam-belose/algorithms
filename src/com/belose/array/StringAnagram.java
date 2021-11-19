package com.belose.array;

import java.util.Arrays;

public class StringAnagram {

    public static void main(String[] args) {
        String name = "sangam";
        String anaGramString = "magnas";
        boolean result = StringAnagram.isAnagram(name.toCharArray(), anaGramString.toCharArray());
        System.out.println("anagram = " + result);


        String name2 = "sangam";
        String anaGramString2 = "afdfdff";
        boolean result2 = StringAnagram.isAnagram(name2.toCharArray(), anaGramString2.toCharArray());
        System.out.println("anagram2 = " + result2);
    }

    public static boolean isAnagram(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

}
