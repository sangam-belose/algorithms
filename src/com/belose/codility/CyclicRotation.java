package com.belose.codility;

import java.util.Arrays;

/**
 * Rotate an array to the right by a given number of steps. For example, given
 * <p>
 * A = [3, 8, 9, 7, 6] K = 3 the function should return [9, 7, 6, 3, 8]. Three rotations were made:
 * <p>
 * [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7] [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9] [7, 6, 3, 8, 9] -> [9, 7,
 * 6, 3, 8] For another example, given
 * <p>
 * A = [0, 0, 0] K = 1 the function should return [0, 0, 0]
 * <p>
 * Given
 * <p>
 * A = [1, 2, 3, 4] K = 4 the function should return [1, 2, 3, 4]
 */
public class CyclicRotation {

    public static void main(String[] args) {
        int arr1[] = new int[]{3, 8, 9, 7, 6};
        int k1 = 3;

        System.out.println("Using same Arr cycle rotation: " + Arrays.toString(
                rotateUsingInplaceRotation(arr1, k1)));

        System.out.println("-----------------------------------------------------");

        int arr2[] = new int[]{3, 8, 9, 7, 6};
        int k2 = 3;

        System.out.println("Using Another arr cycle rotation: " + Arrays.toString(
                rotateUsingAnotherArrRotation(arr2, k2)));

        System.out.println("Using reverse technique rotation: " + Arrays.toString(
                rotateUsingReverse(new int[]{3, 8, 9, 7, 6}, 3)));
    }

    public static int[] rotateUsingInplaceRotation(int[] arr, int k) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        for (int i = 0; i < k; i++) {
            int temp = arr[arr.length - 1];
            while (endIndex > 0) {
                arr[endIndex] = arr[endIndex - 1];
                endIndex--;
            }
            arr[startIndex] = temp;
            System.out.println(Arrays.toString(arr));
            //reset end index
            endIndex = arr.length - 1;
        }
        return arr;
    }

    public static int[] rotateUsingAnotherArrRotation(int[] arr, int k) {

        int [] result = new int[arr.length];

        for (int i= 0; i<arr.length; i++) {
            int resultIndex = (i+k) % arr.length;
            result[resultIndex] = arr[i];
            System.out.println(Arrays.toString(result));
        }

        return result;
    }

    public static void reverse(int []arr, int low, int high) {
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    //Best Approach
    public static int[] rotateUsingReverse(int [] nums, int k) {

        int n = nums.length;
        k = k%n;

        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);

        return nums;
        
    }


}
