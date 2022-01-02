package com.belose.codility;

/**
 * https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/
 */

public class PassingCars {

    public static void main(String[] args) {
        System.out.println(PassingCars.findTotalPassingCars(new int[]{0, 1, 0, 1, 1}));
    }

    public static int findTotalPassingCars(int[] cars) {
        int count = 0;
        int[] suffixSum = new int[cars.length + 1];
        for (int index = cars.length-1; index >= 0; index--) {
            suffixSum[index] = cars[index] + suffixSum[index + 1];

            if(cars[index] == 0)
                count += suffixSum[index];

            //codility max condition
            if(count > 1000000000)
                return -1;
        }

        return count;
    }

}
