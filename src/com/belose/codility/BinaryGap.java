package com.belose.codility;

import java.util.Arrays;

/**
 * Find longest sequence of zeros in binary representation of an integer.
 *
 * @see <a href="https://app.codility.com/programmers/lessons/1-iterations/binary_gap/">...</a>
 * Given a positive integer N, returns the length of its longest binary gap. The function
 * should return 0 if N doesn't contain a binary gap.
 * <p>
 * For example, given N = 1041 the function should return 5, because N has binary representation
 * 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return
 * 0, because N has binary representation '100000' and thus no binary gaps.
 */
public class BinaryGap {

    public static void main(String[] args) {

        int number = 1041;
        String binary = Integer.toBinaryString(number);
        int maxGap = 0;

        if(binary != null && binary.trim().length() > 0) {

            //case 1- start and end is not 1
            if(binary.charAt(0) == '1' && binary.charAt(binary.length()-1) == '1') {
                String arr [] = binary.split("1");
                System.out.println(Arrays.toString(arr));
                for(String s : arr) {
                    if(s.length() > maxGap) {
                        maxGap = s.length();
                    }
                }
                System.out.println("Maximum Gap: "+maxGap);

            } else {
                System.out.println("No Gap");
            }
        }
    }

}
