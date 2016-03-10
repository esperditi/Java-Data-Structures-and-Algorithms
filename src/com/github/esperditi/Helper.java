package com.github.esperditi;

import java.util.Random;

/**
 * Class with methods that facilitate common tasks across testing classes in the project.
 */
public class Helper {

    /**
     * Generates an array of size arrSize of random Integer objects where the
     * generated integer values are between lowerBound and upperBound, inclusive.
     *
     * @param arrSize -- size of array to be generated
     * @param lowerBound -- lowest possible random integer
     * @param upperBound -- largest possible random integer
     */
    public static Integer[] genRandomIntArray(int arrSize, int lowerBound, int upperBound) {

        Integer[] arr = new Integer[arrSize];
        Random rand = new Random();

        for (int i = 0; i < arrSize; i += 1) {
            Integer randNum = rand.nextInt((upperBound - lowerBound) + 1) + lowerBound;
            arr[i] = randNum;
        }

        return arr;
    }
}
