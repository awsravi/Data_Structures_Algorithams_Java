package com.awsravi.data_structures_algorithams_java.searching.binarysearch;

public class BinarySearch {

    /*
    Binary search:
    Binary Search is faster than Linear Search
    Half of the remaining elements can be eliminated at a time, instead of eliminating them one by one
    Binary Search only works for sorted arrays.
     */
    public int binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;

        System.out.println("See : " + low + " " + mid + " " + high);
        while (arr[mid] != target && low <= high) {
            if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = (low + high) / 2;
        }
        if (arr[mid] == target) {
            System.out.println("The element is found at the index: " + mid);
            return mid;
        } else {
            System.out.println("The element " + target + " not found.");
            return -1;
        }

    }
}
