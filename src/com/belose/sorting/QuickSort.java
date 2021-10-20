package com.belose.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int [] items = new int[] {20, 6, 8, 53, 56, 23, 87, 41, 49, 19};
        int [] sortedArray = qsort(items, 0, items.length -1);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int [] qsort( int dataset [], int firstIndex, int lastIndex) {
        if(firstIndex < lastIndex) {
            int pivotIndex = partion(dataset, firstIndex, lastIndex);

            // call recursively
            qsort(dataset, firstIndex, pivotIndex-1);
            qsort(dataset, pivotIndex+1, lastIndex);
        }
        return dataset;
    }

    private static int partion(int[] dataset, int firstIndex, int lastIndex) {

        // this is actually a 0 th position initally
        int pivotValue = dataset[firstIndex];

        int lower = firstIndex + 1;
        int upper = lastIndex;

        boolean pivotFound = false;
        while (!pivotFound) {

            // check left side of array
            while (lower <= upper && dataset[lower] <= pivotValue)
                lower += 1;
            while (dataset[upper] > pivotValue && upper >= lower)
                upper -= 1;

            if(upper < lower) {
                pivotFound = true;
            }
            else{
                int temp = dataset[lower];
                dataset[lower] = dataset[upper];
                dataset[upper] = temp;
            }
        }
        int temp = dataset[firstIndex];
        dataset[firstIndex] = dataset[upper];
        dataset[upper] = temp;
        return upper;
    }

}
