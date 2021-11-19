package com.belose.array;

import java.util.Arrays;

public class MergeTwoArray {

    public static void main(String[] args) {
        int [] nums1 = new int[]{1,2,3,0,0,0};
        int [] nums2 = new int[]{2,5,6};

        new MergeTwoArray().inArray1Shift(nums1,3,  nums2, 3);

        int [] nums3 = new int[]{1};
        int [] nums4 = new int[]{};

        new MergeTwoArray().inArray1Shift(nums3,1,  nums4, 0);

        int [] nums5 = new int[]{0};
        int [] nums6 = new int[]{1};

        new MergeTwoArray().inArray1Shift(nums5,0,  nums6, 1);

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int result[] = new int[nums1.length];
        int i =0,  j = 0, k=0;

        if(n == 0) {
            result = nums1;
        }

        if(m == 0) {
            result = nums2;
        }

        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j] && m !=0) {
                result[k] = nums1[i];
                i++;
                m--;
            } else {
                result[k] = nums2[j];
                j++;
            }
            k++;
        }
            nums1 = result;
        System.out.println(Arrays.toString(nums1));
    }

    public static void inArray1Shift(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for(int i = m; i<nums1.length; i++) {
                nums1[i] = nums2[j];
                j++;
            }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
        }
    }

