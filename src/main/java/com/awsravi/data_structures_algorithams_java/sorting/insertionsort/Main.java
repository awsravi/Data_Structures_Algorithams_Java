package com.awsravi.data_structures_algorithams_java.sorting.insertionsort;

import java.util.Arrays;

public class Main {
    /*
    Insertion Sort is a simple and efficient sorting algorithm that builds
    the sorted list one element at a time. It takes each element and inserts
    it into its correct position relative to the already sorted part of the array.
     */
    /*
    The first element is considered sorted.
    The algorithm picks the next element and inserts it into the correct position relative to the sorted part.
    Inner while loop shifts elements to the right to make space for the inserted element.
    This process repeats for all elements.
     */
     /*
    Internal impl pls check NoteBook step by step
     */

    public static void main(String[] args) {
        int[] a = {8, 7, 3, 6, 2, 5, 3, 1};
        InsertionSort insertionSort = new InsertionSort();
        System.out.println("Before Insertion : " + Arrays.toString(a));
        insertionSort.insertionSort(a);
        insertionSort.printArray(a);
    }
}
