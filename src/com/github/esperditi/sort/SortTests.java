package com.github.esperditi.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * This class is dedicated to running tests on various sorting algorithms.
 */
public class SortTests {


    public static void main(String[] args) {
        selectionSort();
    }

    private static void selectionSort() {
        Integer[] arr = genRandomIntArray(5, 0, 10);

        System.out.println("Selection Sort: ");
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        SelectionSort.selectionSort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
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
