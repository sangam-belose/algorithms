package com.belose.common;

public class MagicNumber {

    public static void main(String[] args) {
        System.out.println(new MagicNumber().isMagicNumber(10));
        System.out.println(new MagicNumber().isMagicNumber(73));
        System.out.println(new MagicNumber().isMagicNumber(82));
        System.out.println(new MagicNumber().isMagicNumber(671));
    }

    public boolean isMagicNumber(int num) {
        return (num-1) % 9 == 0;
    }

}
