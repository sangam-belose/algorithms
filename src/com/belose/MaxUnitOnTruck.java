package com.belose;

import java.util.Arrays;
import java.util.Comparator;

public class MaxUnitOnTruck {

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int sumOfBoxes = 0;
        int sumOfUnits = 0;
        Arrays.sort(boxTypes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o2[1], o1[1]);
            }
        });
        for (int i = 0; i < boxTypes.length && sumOfBoxes < truckSize; i++) {
            int noOfBoxes = boxTypes[i][0];
            if ((sumOfBoxes + noOfBoxes) < truckSize) {
                sumOfUnits += boxTypes[i][1] * noOfBoxes;
                sumOfBoxes += noOfBoxes;
            } else {
                int moreBoxNeed = truckSize - sumOfBoxes;
                sumOfUnits += boxTypes[i][1] * moreBoxNeed;
                sumOfBoxes += moreBoxNeed;
            }
        }
        return sumOfUnits;
    }

    public static void main(String[] args) {
        int arr1[][] = {{1, 3}, {2, 2}, {3, 1}};
        int truckSize1 = 4;
        System.out.println(new MaxUnitOnTruck().maximumUnits(arr1, truckSize1));

        int arr2[][] = {{5,10}, {2,5}, {4,7}, {3,9}};
        int truckSize2 = 10;
        System.out.println(new MaxUnitOnTruck().maximumUnits(arr2, truckSize2));
    }

}
