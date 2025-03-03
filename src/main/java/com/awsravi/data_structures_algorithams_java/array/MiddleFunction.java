package com.awsravi.data_structures_algorithams_java.array;

import java.util.Arrays;

public class MiddleFunction {
    public static int[] middle(int[] array) {
        if (array.length <= 2) {
            return new int[0]; // Return an empty array if the input array has 2 or fewer elements
        }

        // Create a new array with a size of the input array length minus 2
        int[] middleArray = new int[array.length - 2];

        // Copy the elements from the input array, excluding the first and last elements
        int index = 1;
        while (index < array.length - 1) {
            middleArray[index - 1] = array[index];
            index++;
        }

        return middleArray;
    }

    public static void main(String[] args) {
        int[] inputArray1 = {1, 2, 3, 4, 5};
        int[] result1 = middle(inputArray1);
        System.out.println(Arrays.toString(result1)); // Expected output: [2, 3, 4]

        int[] inputArray2 = {10, 20, 30, 40};
        int[] result2 = middle(inputArray2);
        System.out.println(Arrays.toString(result2)); // Expected output: [20, 30]

        int[] inputArray3 = {5, 10}; // Edge case: Array with only 2 elements
        int[] result3 = middle(inputArray3);
        System.out.println(Arrays.toString(result3)); // Expected output: []

        int[] inputArray4 = {7}; // Edge case: Array with 1 element
        int[] result4 = middle(inputArray4);
        System.out.println(Arrays.toString(result4)); // Expected output: []
    }

}
