package com.belose.codility;

/**
 * https://app.codility.com/programmers/lessons/12-euclidean_algorithm/chocolates_by_numbers/
 */
public class ChocolatesByNumbers {

    public static void main(String[] args) {

        System.out.println("Chocolate you ate using lookup array: "+ChocolatesByNumbers.getNumberOfChocolatesYouAte(10, 4));
        System.out.println("Chocolate you ate using GCD: "+ChocolatesByNumbers.getNumOfChocoAteUsingGCD(10, 4));

    }

    public static int getNumberOfChocolatesYouAte(int totalNumOfChocolates, int step){
        boolean[] fields = new boolean[totalNumOfChocolates];
        int counter = 0;
        int cholcateAte = 0;
        int nextIndex = 0;
        while(fields[counter] != true) {
            nextIndex += counter + step;
            if(nextIndex > fields.length-1) {
                nextIndex = nextIndex - fields.length;
            }
            fields[nextIndex] = true;
            cholcateAte++;
        }
        //System.out.println(cholcateAte);
        return cholcateAte;
    }

    public static int getNumOfChocoAteUsingGCD(int totalNumOfChocolates, int step ){
        return totalNumOfChocolates / GCD(totalNumOfChocolates, step);
    }

    private static int GCD(int a, int b){
        while(b != 0){
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

}
