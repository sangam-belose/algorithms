package com.belose.common;

public class Fibonacci {

    public static void main(String[] args) {
        int num = 4;
        System.out.println("-------Using recursion------------");
        for (int i = 0; i <= num; i++) {
            System.out.println(Fibonacci.usingRecursion(i));

        }
        System.out.println("-------Using loop------------");
        Fibonacci.usingLoop(10);
    }

    public static int usingRecursion(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return usingRecursion(num - 1) + usingRecursion(num - 2);
        }
    }

    public static void usingLoop(int num) {
        int f1 = 0, f2 = 1, fib = 0;
        System.out.println(f1);
        System.out.println(f2);
        for (int i = 3; i <= num; i++) {
            fib = f1 + f2;
            f1 = f2;
            f2 = fib;
            System.out.println(fib);
        }

    }
}
