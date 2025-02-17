package com.awsravi.data_structures_algorithams_java.stack.array;

public class Stack_UsingArray {
    int[] arr;
    int topOfStack;

    public Stack_UsingArray(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The Stack is Created with size of : " + size);
    }

    //isEmpty
    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        }
        return false;
    }

    //isFull
    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
            System.out.println("The Stack is Full");
            return true;
        }
        System.out.println("The Stack is not Full");
        return false;
    }

    // Push Method
    public void push(int value) {
        if (isFull()) {
            System.out.println("The Stack is Full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The Stack pushed value : " + value);
        }
    }

    //Pop Method
    public int pop() {
        if (isEmpty()) {
            System.out.println("The Stack is Empty");
            return -1;
        } else {
            int topStock = arr[topOfStack];
            topOfStack--;
            return topStock;
        }
    }

    //Peek Method
    public int peek() {
        if (isEmpty()) {
            System.out.println("The Stack is Empty");
            return -1;
        } else {
            return arr[topOfStack];
        }
    }

    //Delete
    public void delete(int value) {
        arr = null;
        System.out.println("The Stack item is Deleted");
    }

    //Delete Stack
    public void delete() {
        arr = null;
        System.out.println("The Stack is Deleted");
    }
}
