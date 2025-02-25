package com.awsravi.data_structures_algorithams_java.sorting.quicksort;

public class QuickSort {

    /*
    Pivot Selection: The last element (end) is chosen as the pivot.
    Partitioning: Elements smaller than the pivot move to the left.
    Swapping: The pivot is placed in its correct sorted position.
    Returns: The index of the pivot.
     */
    public int partition(int[] array, int start, int end) {
        int pivot = end;
        int i = start - 1;
        for (int j = start; j <= pivot; j++) {
            if (array[j] <= array[pivot]) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return i;
    }

    /*
    Base Case: Stops when start >= end.
    Partitioning: Finds the pivot index.
    Recursive Calls: Sorts left and right partitions.

     */
    public void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);

        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}