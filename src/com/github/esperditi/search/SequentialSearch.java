package com.github.esperditi.search;

/**
 * This class handles the implementation details of the sequential search (linear search) algorithm.
 */
public class SequentialSearch {

    /**
     * sequential search implementation where the algorithms starts at
     * index 0 of array arr and scans each successive element. The algorithm
     * stops when the value val is found or no more elements are left
     * to scan.
     *
     * Time complexity: O(n)
     *
     * @return true if val found and false if not.
     */
    public static <T extends Comparable<? super T>> boolean sequentialSearch (T[] arr, T val) {

        for (int i = 0; i < arr.length; i += 1) {
            if(arr[i].compareTo(val) == 0) {
                return true;
            }
        }

        return false;
    }
}