package com.github.esperditi.search;

import com.github.esperditi.Helper;

import java.util.Arrays;
import java.util.Random;

/**
 * This class is dedicated to running tests on various search algorithms.
 */
public class SearchTests {

    public static void main(String args[]) {
        sequentialSearch();
        binarySearch();
    }

    /**
     * Test for linear search algorithm.
     */
    private static void sequentialSearch() {
        Integer value = 10;
        SequentialSearch ss = new SequentialSearch();
        Integer[] arr = Helper.genRandomIntArray(5, 0, 10);

        System.out.println("Sequential Search: ");
        System.out.println("Array to search: " + Arrays.toString(arr));
        System.out.println("Value to search for: " + value);
        System.out.println("The value " + value + (ss.sequentialSearch(arr, value) ? " was found": " was not found"));
    }

    private static void binarySearch() {
        Integer value = 10;
        Integer[] arr = Helper.genRandomIntArray(5, 0, 10);

        System.out.println("Binary Search: ");
        System.out.println("Array to search: " + Arrays.toString(arr));
        System.out.println("Value to search for: " + value);
        System.out.println("The value " + value + (BinarySearch.binarySearch(arr, value) ? " was found": " was not found"));
    }

}
