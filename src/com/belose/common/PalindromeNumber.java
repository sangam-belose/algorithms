package com.belose.common;

public class PalindromeNumber {

    public static void main(String[] args) {
        int num = 202;
        if(num == reverse(num)) {
            System.out.println("Palindrome");
        }
    }

    private static int reverse(int number){
        int reverse = 0;

        while(number != 0){
            reverse = reverse*10 + number%10;
            number = number/10;
        }

        return reverse;
    }

}
