package com.awsravi.data_structures_algorithams_java.sorting.heapsort;

public class Main {
    
    //https://www.programiz.com/dsa/heap-sort
    public static void main(String[] args) {
        int[] arr = {44, 22, 66, 55, 77, 11, 88, 22, 99};

        HeapSort hs = new HeapSort(arr);

        System.out.println("Array before sorting:");
        hs.printArray();

        hs.sort();

        System.out.println("\n\nArray after sorting:");
        hs.printArray();


    }
}
