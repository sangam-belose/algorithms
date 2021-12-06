package com.belose.common;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(new Factorial().calFactorialUsingRecursion(4));
        System.out.println(new Factorial().calFactorialUsingRecursion(0));
        System.out.println(new Factorial().calFactorial(4));
        System.out.println(new Factorial().calFactorial(0));
    }

    public long calFactorialUsingRecursion(int num) {
        if(num == 0 || num == 1)
            return 1;
        else
            return num * calFactorialUsingRecursion(num-1);
    }

    public long calFactorial(int num ) {
        long fact = 1l;
        for(int i = num ; i> 0 ; i--) {
            fact *=i;
        }
        return fact;
    }

}
