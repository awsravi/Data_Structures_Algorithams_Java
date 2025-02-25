package com.awsravi.data_structures_algorithams_java.sorting.quicksort;

import java.util.Arrays;

public class Main {
    /*
    Quick Sort is a divide-and-conquer sorting algorithm that works by selecting a "pivot" element,
    partitioning the array around the pivot, and recursively sorting the subarrays.
    It is one of the fastest sorting algorithms, with an average-case time complexity of O(n log n).


     */
    public static void main(String[] args) {
        int[] arr = {10, 11, 12, 8, 9, 17, 18, 13, 14, 15, 5, 6, 7, 16, 19};

        QuickSort qs = new QuickSort();
        System.out.println("before Sorting array: " + Arrays.toString(arr));
        qs.quickSort(arr, 0, arr.length - 1);
        System.out.println("after Sorting array: ");
        qs.printArray(arr);
    }
}
