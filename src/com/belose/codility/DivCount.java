package com.belose.codility;

public class DivCount {

    public static void main(String[] args) {
        System.out.println(DivCount.findDivCount(2, 10, 2));
        System.out.println(DivCount.findDivCount(6, 11, 2));
        System.out.println(DivCount.findDivCount(4, 17, 3));
        System.out.println(DivCount.findDivCount(6, 12, 2));
        System.out.println(DivCount.findDivCount(5, 18, 3));

        System.out.println("----------using Math functions---------------------");
        System.out.println(DivCount.findDivCountWithMathLib(2, 10, 2));
        System.out.println(DivCount.findDivCountWithMathLib(6, 11, 2));
        System.out.println(DivCount.findDivCountWithMathLib(4, 17, 3));
        System.out.println(DivCount.findDivCountWithMathLib(6, 12, 2));
        System.out.println(DivCount.findDivCountWithMathLib(5, 18, 3));
    }

    public static int findDivCount(int start, int end, int divisor) {
        int count = 0;
        if (start % divisor == 0) {
            count += 1;
        } else if (end % divisor == 0) {
            count += 1;
        }
        if (divisor != 0) {
            count += (end / divisor) - (start / divisor);
        }
        return count;
    }

    public static int findDivCountWithMathLib(int start, int end, int divisor) {

        if (divisor != 0) {
            double nStart = Math.ceil(start / (double) divisor);
            double nEnd = Math.floor(end / (double) divisor);

            return (int) (nEnd - nStart + 1);
        }
        return -1;
    }
}
