package com.awsravi.data_structures_algorithams_java.sorting.countingsort;

import java.util.Arrays;

public class Main {
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
