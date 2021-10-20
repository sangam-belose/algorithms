package com.belose.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
       int [] items = new int[] {6, 20, 8, 19, 56, 23, 87, 41, 49, 53};
       int [] sortedArray = msort(items);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] msort(int [] dataset) {
        //calculate mid
        if (dataset.length > 1) {
            int mid = dataset.length / 2;
            int[] leftarr = Arrays.copyOfRange(dataset, 0, mid);
            int[] rightarr = Arrays.copyOfRange(dataset, mid, dataset.length);

            msort(leftarr);
            msort(rightarr);

            int i = 0, j = 0, k = 0;

            // compare left and right array
            while (i < leftarr.length && j < rightarr.length) {
                if (leftarr[i] < rightarr[j]) {
                    dataset[k] = leftarr[i];
                    i += 1;

                } else {
                    dataset[k] = rightarr[j];
                    j += 1;
                }
                k += 1;
            }

            //check if any more element in left array
            while(i < leftarr.length) {
                dataset[k] = leftarr[i];
                i += 1;
                k += 1;
            }

            //check if any more element in right array
            while(j < rightarr.length) {
                dataset[k] = rightarr[j];
                j += 1;
                k += 1;
            }
        }
        return dataset;
    }

}
