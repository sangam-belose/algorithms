package com.belose.array;

public class PrintDuplicatesInArray {

    public static void main(String[] args) {
        int [] arr = new int[]{1,0,2,3,0,4,5,0, 1};

        for(int i = 0; i< arr.length; i++){
            if(arr[Math.abs(arr[i])]> 0) {
                arr[Math.abs(arr[i])] = - arr[Math.abs(arr[i])];
            } else {
                System.out.println(arr[i]);
            }
        }
    }

}
