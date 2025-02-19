package com.awsravi.data_structures_algorithams_java.tree.binarytree.array;

public class BinaryTreeArray {
    String[] arr;
    int lastUserIndex;

    public BinaryTreeArray(int size) {
        arr = new String[size + 1];
        this.lastUserIndex = 0;
        System.out.println("Array Created with Size : " + size);
    }

    //isFull
    public boolean isFull() {
        if (arr.length - 1 == lastUserIndex) {
            return true;
        }
        System.out.println("Waiting for last element to be full");
        return false;

    }

    //Insert Tree use Array
    public void insert(String value) {
        if (!isFull()) {
            arr[lastUserIndex + 1] = value;
            lastUserIndex++;
            System.out.println("Inserted value : " + value);
        } else {
            System.out.println("Array is Full ");
        }
    }

    //PreOrder Tree Use Array
    public void preOrder(int index) {
        if (index > lastUserIndex) {
            return;
        }
        System.out.print(arr[index] + "  ");
        preOrder(index * 2);
        preOrder(index * 2 + 1);
    }

    //InOrder Tree Use Array
    public void inOrder(int index) {
        if (index > lastUserIndex) {
            return;
        }
        preOrder(index * 2);
        System.out.print(arr[index] + "  ");
        inOrder(index * 2 + 1);
    }

    //PostOrder tree Use Array
    public void postOrder(int index) {
        if (index > lastUserIndex) {
            return;
        }
        preOrder(index * 2);
        postOrder(index * 2 + 1);
        System.out.print(arr[index] + "  ");
    }

    //Level Order Tree use Array
    public void levelOrder() {
        for (int i = 1; i <= lastUserIndex; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    //Search
    public int search(String value) {
        for (int i = 1; i <= lastUserIndex; i++) {
            if (arr[i] == value) {
                System.out.print(value + " -> Exists at index Location : " + i);
                return i;
            }
        }
        System.out.println("Value not found");
        return -1;
    }

    //Delete Method Tree Use Array
    public void delete(String value) {
        int location = search(value);
        if (location == -1) {
            return;
        } else {
            arr[location] = arr[lastUserIndex];
            lastUserIndex--;
            System.out.println(" -> The Node Successfully Deleted Value ");
        }
    }

    //Delete BinaryTree Array
    public void deleteBt() {
        try {
            arr = null;
            System.out.println("Successfully Deleted BT ");
        } catch (Exception e) {
            System.out.println("Exception occured while deleting BT ");
        }
    }
}
