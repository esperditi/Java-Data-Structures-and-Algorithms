package com.github.esperditi.sort;

import java.util.Arrays;

/**
 * This class handles the implementation details of the merge sort algorithm.
 */
public class MergeSort {

    /**
     * Merge Sort sorts elements in the input array by recursively dividing the array
     * into halves, sorting those halves and merging them back together. The recursion
     * ends when the array in question is of size one, since there is nothing to sort
     * in that case.
     *
     * When considering mergeSort's recursive calls as a recursion tree, it can be noted
     * that the depth of the tree is O(log n), doing O(n) work within the method each
     * time.
     *
     * Time complexity: O(n log n)
     *
     * @param arr -- array to sort
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void mergeSort(T[] arr) {
        if(arr.length <= 1) {
            return;
        }

        //Copy half of the elements in arr into arrLeft and the other half into arrRight.
        int mid = arr.length/2;

        T[] arrLeft = Arrays.copyOfRange(arr,0, mid);
        T[] arrRight = Arrays.copyOfRange(arr, mid, arr.length);

        for(int i = 0; i < arrLeft.length; i++)
        {
            arrLeft[i] = arr[i];
        }
        for(int j = mid; j < arr.length; j++)
        {
            arrRight[j - mid] = arr[j];
        }

        //recursively call mergeSort to divide and sort array in the process
        mergeSort(arrLeft);
        mergeSort(arrRight);

        //merge the left and right array into the original, sorting in the process
        merge(arrLeft, arrRight, arr);
    }

    /**
     * This method will merge the two sorted arrays, arrA and arrB, in a sorted manner
     * into an output array, arrOrig, by iterating through both arrays and appending the smallest
     * element of each into the output array.
     *
     * Letting n be the sum of the number of elements in the arrays to be merged. The while loop
     * takes linear time to complete, and so does inserting any remaining items, both
     * doing constant amount of work each time.
     *
     * Time complexity: O(n)
     *
     * @param arrA -- first sorted array
     * @param arrB -- second sorted array
     * @param arrOrig -- output array
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void merge(T[] arrA, T[] arrB, T[] arrOrig) {
        int idxA = 0, idxB = 0, idxCurr = 0;

        //iterate over the input arrays and add them to the output array in sorted order
        while (idxA < arrA.length && idxB < arrB.length) {
            if (arrA[idxA].compareTo(arrB[idxB]) < 0) {
                arrOrig[idxCurr] = arrA[idxA];
                idxA++;
            } else {
                arrOrig[idxCurr] = arrB[idxB];
                idxB++;
            }
            idxCurr++;
        }

        //insert any remaining items into the output array
        if (idxA >= arrA.length) {
            System.arraycopy(arrB, idxB, arrOrig, idxCurr, arrB.length - idxB);
        } else {
            System.arraycopy(arrA, idxA, arrOrig, idxCurr, arrA.length - idxA);
        }
    }
}