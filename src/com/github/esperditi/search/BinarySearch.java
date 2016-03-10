package com.github.esperditi.search;

/**
 * This class handles the implementation details of the binary search algorithm.
 */
public class BinarySearch {

    /**
     * Binary search algorithm that requires array arr to be sorted in non-decreasing order. At
     * each iteration of the while loop, the range of searched values is divided in half. The loop
     * terminates when either the value val is found or there are no more elements in the search range.
     *
     * Therefore, the number of iterations i is bounded by the number of times arr is divided in half before
     * the sought range is 1. Taking the size as n, it's clear n/2^(i) = 1 -> 2^(i) = n, where i log base 2 of n.
     *
     * Time complexity: O(log(n))
     *
     * @param arr -- array to search
     * @param val -- sought value
     * @return
     */
    public static <T extends Comparable<? super T>> boolean binarySearch(T[] arr, T val) {
        int leftIdx = 0;
        int rightIdx = arr.length -1;
        
        while (leftIdx <= rightIdx) {
            int mid = (leftIdx + rightIdx)/2;

            if(arr[mid] == val) {
                return true;
            }
            if (val.compareTo(arr[mid]) < 0) {
                rightIdx = mid - 1;
            } else {
                leftIdx = mid + 1;
            }
        }

        return false;
    }
}