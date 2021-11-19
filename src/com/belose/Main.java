package com.belose;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int num = 5;
        for (int i =0; i<= num; i++){
            System.out.println(Main.fib(i));
        }
    }

    public static int fib(int num) {
        if (num == 0 || num == 1)
            return 1;
        else
            return fib(num-1) + fib(num-2);
    }
}
