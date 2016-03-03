package com.github.esperditi;

import java.util.Arrays;
import java.util.Random;

/**
 * This class is dedicated to running tests on various search algorithms.
 */
public class SearchTests {

    public static void main(String args[]) {
        line();
        sequentialSearch();
        line();
    }

    /**
     * Test for linear search algorithm.
     */
    private static void sequentialSearch() {
        Integer value = 10;
        SequentialSearch ss = new SequentialSearch();
        Integer[] arr = genRandomIntArray(5, 0, 10);

        System.out.println("Array to search: " + Arrays.toString(arr));
        System.out.println("Value to search for: " + value);
        System.out.println("The value " + value + (ss.sequentialSearch(arr, value) ? " was found": " was not found"));
    }

    /**
     * Simple method that prints lines to help delineate console-bound output
     */
    private static void line() {
        System.out.println("----------------------");
    }

    /**
     * Generates an array of size arrSize of random Integer objects where the
     * generated integer values are between lowerBound and upperBound, inclusive.
     *
     * @param arrSize -- size of array to be generated
     * @param lowerBound -- lowest possible random integer
     * @param upperBound -- largest possible random integer
     */
    private static Integer[] genRandomIntArray(int arrSize, int lowerBound, int upperBound) {

        Integer[] arr = new Integer[arrSize];
        Random rand = new Random();

        for (int i = 0; i < arrSize; i += 1) {
            Integer randNum = rand.nextInt((upperBound - lowerBound) + 1) + lowerBound;
            arr[i] = randNum;
        }

        return arr;
    }
}
