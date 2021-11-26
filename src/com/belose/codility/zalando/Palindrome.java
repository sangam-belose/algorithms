package com.belose.codility.zalando;

public class Palindrome {

    public String solution(String S) {
        char[] tokens = S.toCharArray();
        if(!isPalidrome(tokens)) {
            return "NO";
        }
        int n = tokens.length;
        for(int i = 0; i< n; i++) {
            if(tokens[i] == '?') {
                if(tokens[n-i-1] != '?')
                    tokens[i] = tokens[n-i-1];
                else
                    tokens[i] = tokens[n-i-1] = 'a';
            }
        }

        return String.valueOf(tokens);
    }

    static boolean isPalidrome(char [] tokens) {
        int startPointer = 0;
        for(int i= 0; i< tokens.length / 2; i++) {
            if(tokens[startPointer] != '?' && tokens[tokens.length - i -1] !='?'
                    && tokens[i] != tokens[tokens.length-i-1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Palindrome().solution("?a?"));
    }
}

