package com.awsravi.data_structures_algorithams_java.sorting.shellsort;

import java.util.Arrays;

public class Main {
    /*
    Shell Sort is an in-place, comparison-based sorting algorithm that is a variation of Insertion Sort.
    It sorts elements at progressively smaller intervals (gaps) to improve efficiency. The final step uses
    Insertion Sort, but since elements are already partially sorted, the sorting is much faster than standard Insertion Sort.
     */

    /*
    Choose an initial interval (gap), usually starting with n/2 where n is the array size.
    Sort elements at the given interval using an insertion-sort-like process.
    Reduce the interval and repeat the sorting process.
    Repeat until the interval is 1, at which point the array is fully sorted.
     */
    public static void main(String args[]) {
        int[] data = {44, 22, 11, 66, 77, 99, 88, 55};
        int size = data.length;
        ShellSort ss = new ShellSort();
        ss.shellSort(data, size);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
