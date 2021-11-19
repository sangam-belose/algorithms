package com.belose.array;

public class ArrayBasic {

    public static void main(String[] args) {
        int [] arr = new int[10];

        /// The pre-increment and post-increment (i++ and ++i) works same in for loop
        for (int i=0; i<arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }
        System.out.println("======================================");
        for (int i=0; i<arr.length; ++i) {
            arr[i] = i;
            System.out.println(arr[i]);
        }
    }

}
