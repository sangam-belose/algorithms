package com.belose.string;

public class PalindromeString {

    public static void main(String[] args) {
        System.out.println(new PalindromeString().isPalindromeUsingRecursion("mam"));
    }

    public boolean isPalindromeUsingRecursion(String word){
        String reversed = reverse(word);
        if(reversed.equals(word))
            return true;
        else
            return false;
    }

    private String reverse(String word) {
        if(word != null && word.length() <=1)
            return word;

        return word.charAt(word.length()-1) + reverse(word.substring(0, word.length()-1));
    }

}
