package com.awsravi.data_structures_algorithams_java.sorting.countingsort;

import java.util.Arrays;

public class Main {

    /*
    Counts the occurrences of each element and then uses those counts to place the elements in their sorted positions.
    Efficient for sorting integers within a limited range.


     */
    public static void main(String[] args) {

        int[] data = {4, 2, 2, 8, 3, 3, 1};
        int size = data.length;
        System.out.println("Before Sort : " + Arrays.toString(data));
        CountingSort cs = new CountingSort();
        cs.countSort(data, size);
        System.out.println("After Sort : ");
        System.out.println(Arrays.toString(data));
    }

}
