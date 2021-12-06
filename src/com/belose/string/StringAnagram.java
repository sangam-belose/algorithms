package com.belose.string;

import java.util.Arrays;

public class StringAnagram {

    public static void main(String[] args) {
        String s1 = "sangam";
        String s2 = "magnas";

        System.out.println(new StringAnagram().isAnagram(s1.toCharArray(),s2.toCharArray()));

    }

    public boolean isAnagram(char[] str1, char[] str2) {
        if (str1.length != str2.length)
            return false;

        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);
    }

}
