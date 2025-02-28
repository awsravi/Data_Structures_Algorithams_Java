package com.awsravi.data_structures_algorithams_java.searching.linearsearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 11, 12, 8, 9, 17, 18, 13, 14, 15, 5, 6, 7, 16, 19};
        Searching s = new Searching();
        System.out.println("Before Merge array : " + Arrays.toString(arr));
        s.linearSearch(arr, 9);
    }
}
