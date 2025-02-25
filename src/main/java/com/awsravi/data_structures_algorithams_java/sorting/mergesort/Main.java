package com.awsravi.data_structures_algorithams_java.sorting.mergesort;

import java.util.Arrays;

public class Main {
    /*
    Merge Sort is a divide-and-conquer sorting algorithm that splits an array into smaller subarrays,
    sorts them, and then merges them back together. It is efficient for large datasets and has a
    consistent time complexity of O(n log n).
     */
    public static void main(String[] args) {
        int[] arr = {10, 11, 12, 8, 9, 17, 18, 13, 14, 15, 5, 6, 7, 16, 19};
        MergeSort ms = new MergeSort();
        System.out.println("Before Merge array : " + Arrays.toString(arr));
        ms.mergeSort(arr, 0, arr.length - 1);
        ms.printArray(arr);
    }
}
