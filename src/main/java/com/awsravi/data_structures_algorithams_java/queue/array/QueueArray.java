package com.awsravi.data_structures_algorithams_java.queue.array;

public class QueueArray {
    int[] array;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size) {
        this.array = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The Queue is created successfully with size of : " + size);
    }

    public boolean isFull() {
        if (topOfQueue == array.length - 1) {
            System.out.println("The queue is Full");
            return true;
        } else {
            System.out.println("The queue was Not Full");
            return false;
        }
    }

    public boolean isEmpty() {
        if (beginningOfQueue == -1 || beginningOfQueue == array.length) {
            System.out.println("The queue is Empty");
            return true;
        } else {
            System.out.println("The queue is Not Empty");
            return false;
        }
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("The queue is full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            array[topOfQueue] = value;
            System.out.println("TSuccessfully added value to the queue : " + value);

        } else {
            topOfQueue++;
            array[topOfQueue] = value;
            System.out.println("TSuccessfully added value to the queue : " + value);

        }
    }


    public int dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is Empty");
            return -1;
        } else {
            int value = array[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            }
            return value;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return array[beginningOfQueue];
        } else {
            System.out.println("The queue is Empty");
            return -1;
        }
    }

    public void deletequeue() {
        array = null;
        System.out.println("The queue is deleted");
    }
}
