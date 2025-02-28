package com.awsravi.data_structures_algorithams_java.sorting.bubblesort;

import java.util.Arrays;

public class Main {
    /*
    Bubble Sort is a simple sorting algorithm that repeatedly steps through the list,
    compares adjacent elements, and swaps them if they are in the wrong order.
    This process continues until the entire array is sorted.
    The algorithm gets its name because smaller elements "bubble" to the top of the array with each iteration.
     */
    /*
    n = array.length; → Stores the number of elements in the array.
    Outer loop (i) → Runs n-1 times (each pass moves the largest element to its correct position).
    Inner loop (j) → Compares adjacent elements and swaps them if needed.
    The biggest value in each iteration moves to the correct position at the end, reducing the number of comparisons needed.
     */
     /*
    Internal impl pls check NoteBook step by step
     */
    //https://www.programiz.com/dsa/bubble-sort
    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();

        int[] arr = {47, 82, 22, 4, 93, 104, 33, 99};
        System.out.println("Before Sorting : " + Arrays.toString(arr));
        bubbleSort.bubbleSort(arr);
        bubbleSort.printArray(arr);
    }
}
