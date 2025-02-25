package com.awsravi.data_structures_algorithams_java.sorting.selectionsort;

public class SelectionSort {

    void selectionSort(int[] a) {
        for (int j = 0; j < a.length; j++) {
            int minimumIndex = j;
            for (int i = j + 1; i < a.length; i++) {
                if (a[i] < a[minimumIndex]) {
                    minimumIndex = i;
                }
            }
            if (minimumIndex != j) {
                int temp = a[j];
                a[j] = a[minimumIndex];
                a[minimumIndex] = temp;
            }
        }
    }


    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
