package com.belose.codility;

import java.util.Arrays;

public class FlagPeak {

    public static void main(String[] args) {
        System.out.println("find total flags: " + FlagPeak.findTotalFlags(
                new int[]{1, 5, 3, 4, 3, 4, 2, 3, 4, 6, 2}));
    }

    public static int findTotalFlags(int[] positions) {

        int[] peaks = new int[positions.length];
        int currentPeak = positions.length;

        //set last value to index greater than array Index i.e. length to avoid index outof bound.
        peaks[positions.length - 1] = currentPeak;
        for (int i = positions.length - 2; i > 0; i--) {
            if (positions[i - 1] < positions[i] && positions[i + 1] < positions[i]) {
                currentPeak = positions[i];
            }
            peaks[i] = currentPeak;
        }

        //set first value to avoid index out of bound.
        peaks[0] = currentPeak;

        System.out.println(Arrays.toString(peaks));

        int currentGuess = 0;
        int nextGuess = 0;
        while (canPlaceFlags(peaks, nextGuess)) {
            currentGuess = nextGuess;
            nextGuess += 1;
        }
        return currentGuess;
    }

    private static boolean canPlaceFlags(int[] peaks, int numOfFlags) {
        int currentPosition = 1 - numOfFlags;

        for (int i = 0; i < numOfFlags; i++) {
            if (currentPosition + numOfFlags > peaks.length - 1) {
                return false;
            }
            currentPosition = peaks[currentPosition + numOfFlags];
        }
        return currentPosition < peaks.length;
    }

}
