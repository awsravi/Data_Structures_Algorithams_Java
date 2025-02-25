package com.awsravi.data_structures_algorithams_java.sorting.selectionsort;

import java.util.Arrays;

public class Main {
    /*
    Selection Sort is a simple sorting algorithm that repeatedly selects the
    smallest (or largest) element from the unsorted portion of the array and swaps
    it with the first element of the unsorted section. This process continues until the entire array is sorted.
     */
    /*
    Start with the first element as the minimum.
    Scan the rest of the array to find the smallest element.
    Swap it with the first element.
    Move to the next position and repeat the process until the array is sorted.
     */
    public static void main(String[] args) {
        int[] arr = {87, 45, 22, 56, 1, 61, 2};
        SelectionSort selectionSort = new SelectionSort();
        System.out.println("Before Sorting : " + Arrays.toString(arr));
        selectionSort.selectionSort(arr);
        selectionSort.printArray(arr);
    }
}
