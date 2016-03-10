package com.github.esperditi.sort;

import com.github.esperditi.Helper;
import java.util.Arrays;

/**
 * This class is dedicated to running tests on various sorting algorithms.
 */
public class SortTests {

    /**
     * Comment out the different tests in main to test different sorting algorithms!
     * @param args
     */
    public static void main(String[] args) {
        //selectionSort();
        //insertionSort();
    }

    /**
     * Test for selection sort algorithm.
     */
    private static void selectionSort() {
        Integer[] arr = Helper.genRandomIntArray(5, 0, 10);

        System.out.println("Selection Sort: ");
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        SelectionSort.selectionSort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }

    private static void insertionSort() {
        Integer[] arr = Helper.genRandomIntArray(5, 0, 10);

        System.out.println("Insertion Sort: ");
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        InsertionSort.insertionSort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}