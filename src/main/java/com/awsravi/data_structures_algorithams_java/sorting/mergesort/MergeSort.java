package com.awsravi.data_structures_algorithams_java.sorting.mergesort;

public class MergeSort {

    /*
    Create temporary arrays (leftTemp and rightTemp) to store the left and right subarrays.
    Copy data from the original array into these temporary arrays.
    Add sentinel values (Integer.MAX_VALUE) to avoid extra checks when merging.
    Merge the two sorted arrays back into the original array.
    Note: if any doubt Revisit your NoteBook
     */
    public void merge(int[] A, int left, int middle, int right) {

        int[] leftTemp = new int[middle - left + 2];
        int[] rightTemp = new int[right - middle + 1];
        for (int i = 0; i <= middle - left; i++) {
            leftTemp[i] = A[left + i];
        }
        for (int i = 0; i < right - middle; i++) {
            rightTemp[i] = A[middle + 1 + i];
        }
        leftTemp[middle - left + 1] = Integer.MAX_VALUE;
        rightTemp[right - middle] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for (int k = left; k <= right; k++) {
            if (leftTemp[i] < rightTemp[j]) {
                A[k] = leftTemp[i];
                i++;
            } else {
                A[k] = rightTemp[j];
                j++;
            }
        }
    }

    /*
    Base Condition: If left < right, continue dividing.
    Divide: Find the middle and recursively sort both halves.
    Merge: Call the merge function to combine sorted subarrays.
     */
    public void mergeSort(int[] Array, int left, int right) {
        if (right > left) {
            int middleofArray = (left + right) / 2;
            mergeSort(Array, left, middleofArray);
            mergeSort(Array, middleofArray + 1, right);
            merge(Array, left, middleofArray, right);
        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
