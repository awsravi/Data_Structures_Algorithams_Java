package com.awsravi.data_structures_algorithams_java.searching.linearsearch;

public class Searching {
    /*
    Linear Search is a sequential searching algorithm that checks each element in
    the array one by one until it finds the target element or reaches the end of the array.
    It is simple but inefficient for large datasets.
     */

    /*
    Iterate through the array (for loop).
    Check if arr[i] is equal to target.
    If found, print and return the index.
    If not found, return -1.
   Note : if any doubt check NoteBook.
     */
    //https://www.programiz.com/dsa/linear-search
    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Index found At : " + i);
                return i;
            }
        }
        System.out.println("Not found");
        return -1;

    }
}
