package com.awsravi.data_structures_algorithams_java.sorting.bucketsort;

public class Main {
    /*
    Distributes elements into a number of buckets.
    Then sorts the buckets individually.
    Works best when input data is uniformly distributed.
     */
    /*
    Determine the number of buckets: The number of buckets is set as √(array length).
    Find the maximum value in the array: Used to normalize values while distributing them into buckets.
    Distribute elements into buckets: Each element is assigned to a bucket using the formula:

    Sort each bucket individually: The Collections.sort() method is used.
    Merge the sorted buckets: The elements are copied back into the original array.
     */

    //https://www.programiz.com/dsa/bucket-sort
    public static void main(String[] args) {
        int[] arr = {44, 22, 66, 55, 77, 11, 88, 33, 99};

        BucketSort bs = new BucketSort(arr);

        System.out.println("Array before sorting:");
        bs.printArray();

        bs.bucketSort();

        System.out.println("\n\nArray after sorting:");
        bs.printArray();


    }
}
