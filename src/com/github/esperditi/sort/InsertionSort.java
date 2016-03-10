package com.github.esperditi.sort;

/**
 * This class handles the implementation details of the insertion sort algorithm.
 */
public class InsertionSort {

    /**
     * Insertion sort algorithm that inserts arr[i] in its proper place amongst arr[0 ... i].
     * Elements in arry may be shifted to correctly insert arr[i].
     *
     * The outer loop iterates n times, and the inner loop iterates at most n times.
     *
     * Time complexity: O(n^2)
     *
     * @param arr -- array to sort
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void insertionSort(T[] arr) {

        for (int i = 1; i < arr.length; i += 1) {
            T temp = arr[i];    //element to put in proper place
            int j = i - 1;      //element to start search at

            /*
             * Iterate while there are elements to compare and while our element is
             * bigger than the element it's being compared with at index j.
             */
            while (j > -1 && arr[j].compareTo(temp) > 0) {
                arr[j + 1] = arr[j];
                j -= 1;
            }

            arr[j + 1] = temp;  //place element in question in correct place
        }
    }
}
