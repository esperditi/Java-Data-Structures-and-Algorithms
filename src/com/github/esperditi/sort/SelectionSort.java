package com.github.esperditi.sort;

/**
 * This class handles the implementation details of the selection sort algorithm.
 */
public class SelectionSort {

    /**
     * Selection sort algorithm that finds the smallest element in the range of arr[i ... n-1]
     * in arr, where n is the length of arr, and exchanges that element with arr[i]. The
     * elements are sorted in ascending order.
     *
     * The outer loop iterates n times, and the inner loop iterates at most n times.
     *
     * Time complexity: O(n^2)
     *
     * @param arr -- array to sort
     * @param <T> -- generic type
     */
    public static <T extends Comparable<? super T>> void selectionSort(T[] arr) {

        for (int i = 0; i < arr.length; i += 1) {
            int minIdx = i; //min index for some iteration of outer loop

            //search for smaller index at starting at index (i + 1)
            for (int j = (i + 1); j < arr.length; j += 1) {

                if (arr[j].compareTo(arr[minIdx]) < 0) {
                    minIdx = j; //smaller index found
                }
            }

            //swap i with min index found (may be i itself)
            T temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
}
