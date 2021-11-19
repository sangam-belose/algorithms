package com.belose.string;

public class AlternatingCharactersAlgo {

    public static void main(String[] args) {
        System.out.println(AlternatingCharactersAlgo.alternatingCharacters("AAAA"));
        System.out.println(AlternatingCharactersAlgo.alternatingCharacters("BBBBB"));
        System.out.println(AlternatingCharactersAlgo.alternatingCharacters("ABABABAB"));
        System.out.println(AlternatingCharactersAlgo.alternatingCharacters("BABABA"));
        System.out.println(AlternatingCharactersAlgo.alternatingCharacters("AAABBB"));
        System.out.println(AlternatingCharactersAlgo.alternatingCharacters("AAABBBAABB"));


    }

    public static int alternatingCharacters(String s) {
        // Write your code here

        int deleteCount = 0;
        char [] chars = s.toCharArray();
        int i = chars.length-1;
        while(i >= 1) {
            if(chars[i] == 'A' && chars[i-1] == 'A') {
                deleteCount++;
                i--;
            }else if(chars[i] == 'B' && chars[i-1] == 'B') {
                deleteCount++;
                i--;
            } else{
                i--;
            }
        }
        return deleteCount;

    }

}
