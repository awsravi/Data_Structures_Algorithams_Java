package com.awsravi.data_structures_algorithams_java.queue.circularqueue;

public class CircularQueue {
    int[] arr;
    int topOfQueue;
    int beginingOfQueue;
    int size;

    //Initializes the queue, sets beginingOfQueue and topOfQueue to -1 (indicating an empty queue).
    public CircularQueue(int size) {
        this.size = size;
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginingOfQueue = -1;
        System.out.println("The CQueue is created with siz : " + size);
    }

    //Prints the elements from beginingOfQueue to topOfQueue using circular indexing.
    public void display() {
        if (beginingOfQueue == -1 || beginingOfQueue > topOfQueue) {
            System.out.println("Queue is Empty Display");
        } else {
            System.out.print("Queue Elements: ");
            for (int i = beginingOfQueue; i <= topOfQueue; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    //Returns true if front == -1, meaning the queue has no elements.
    public boolean isEmpty() {
        if (beginingOfQueue == -1) {
            System.out.println("Queue is Empty");
            return true;
        }
        System.out.println("Queue is Not Empty");
        return false;
    }
    //The queue is full when the next position of rear is equal to front ((rear + 1) % size == front).

    public boolean isFull() {
        if (topOfQueue + 1 == beginingOfQueue) {
            System.out.println("Queue is Full");
            return true;
        } else if (beginingOfQueue == 0 && topOfQueue + 1 == size) {
            System.out.println("Queue is Full");
            return true;
        } else {
            System.out.println("Queue is Not Full");
            return false;
        }
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else if (isEmpty()) {
            beginingOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Inserted Element : " + value);
        } else {
            if (topOfQueue + 1 == size) {
                topOfQueue = 0;
            } else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;
            System.out.println("Inserted Element : " + value);
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            int result = arr[beginingOfQueue];
            arr[beginingOfQueue] = 0;
            if (beginingOfQueue == topOfQueue) {
                beginingOfQueue = topOfQueue = -1;
            } else if (beginingOfQueue + 1 == size) {
                beginingOfQueue = 0;
            } else {
                beginingOfQueue++;
            }
            return result;
        }
    }

    //The peek() method in a circular queue returns the front element without removing it.
    // It allows you to check the first element in the queue without modifying the queue structure.
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty! No element to peek.");
            return -1;
        }
        return arr[beginingOfQueue];
    }

    public void deleteQueue() {
        arr = null;
        System.out.println("Successfully Deleted Element ");
    }

}
