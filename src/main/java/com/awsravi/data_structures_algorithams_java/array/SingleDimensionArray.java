package com.awsravi.data_structures_algorithams_java.array;

public class SingleDimensionArray {

    int[] arr = null;

    public static void main(String[] args) {
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray();
        singleDimensionArray.singleDimensionArray(3);
        singleDimensionArray.insert(1, 2);
        singleDimensionArray.traverseArray();
        singleDimensionArray.searchInArray(2);
        singleDimensionArray.deleteValue(1);
    }

    public void singleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
        System.out.println(arr.length);
        // System.out.println(arr[0]);
    }

    // Array Traversal

    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Insert :: Successfully Inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }

    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
                System.out.println("traverseArray");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists!");
        }

    }

    //Search for an element in the given Array
    public void searchInArray(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Value is found at the index of " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found");
    }

    // Delete value from Array
    public void deleteValue(int valueToDeleteIndex) {
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range of array");

        }
    }
}
