package com.awsravi.data_structures_algorithams_java.sorting.radixsort;

public class Main {
    /*
    orts elements by processing individual digits or characters.
    Efficient for sorting integers or strings.

     */
    /*
    Radix Sort is a non-comparative, stable sorting algorithm that works by sorting numbers
    digit by digit, starting from the least significant digit (LSD) to the most significant
    digit (MSD). It uses Counting Sort as a subroutine to sort numbers based on individual digit places.
     */
    /*
    Find the maximum number in the array to determine the number of digits.
    Sort each digit position (1s, 10s, 100s, etc.) using Counting Sort.
    Repeat for each significant place until the highest place value is reached.

     */
    public static void main(String[] args) {
        int[] data = {88, 11, 66, 4, 1, 77, 99};
        RadixSort.radixSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
