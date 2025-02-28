package com.awsravi.data_structures_algorithams_java.sorting.countingsort;

public class CountingSort {

    /*
    Counting Sort is a non-comparative, integer-based sorting algorithm that sorts an array by
    counting the occurrences of each unique element and using this information to determine the
    correct position of each element in the sorted output.
     */
    /*
    Find the maximum element in the input array.
    Create a count array of size (max + 1), initialized to 0.
    Store the count of each element in the count array.
    Compute the cumulative sum in the count array. This helps in determining the position of each element in the output array.
    Build the output array by placing each element in its correct sorted position.
    Copy the output array back to the original array.

     */

    // Counting sort in Java programming
    void countSort(int array[], int size) {
        int[] output = new int[size + 1];

        // Find the largest element of the array
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max)
                max = array[i];
        }
        int[] count = new int[max + 1];

        // Initialize count array with all zeros.
        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        // Store the count of each element
        for (int i = 0; i < size; i++) {
            count[array[i]]++;
        }

        // Store the cummulative count of each array
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Find the index of each element of the original array in count array, and
        // place the elements in output array
        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        // Copy the sorted elements into original array
        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }
    }

}
