package com.awsravi.data_structures_algorithams_java.queue.linkedlist;

public class QueueLinkedList {
    LinkedList list;

    public QueueLinkedList() {
        list = new LinkedList();
        System.out.println("The Queue is Successfully created QueueLinkedList ");
    }

    //isEmpty
    public boolean isEmpty() {
        if (list.head == null) {
            System.out.println("QueueLinkedList : yes the queue is Empty");
            return true;
        } else {
            System.out.println("QueueLinkedList : yes the queue is Not Empty");
            return false;
        }
    }

    //EnQueue
    public void enqueue(int value) {
        list.insertInLinkedList(value, list.size);
        System.out.println("Inserted : enqueued value : " + value);
    }

    //DeQueue
    public int dequeue() {
        int value = -1;
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return value;
        } else {
            value = list.head.value;
            list.deletionOfNode(0);
            System.out.println("Deleted value : " + value);
        }
        return value;
    }

    //peek
    public int peek() {
        int value = -1;
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return value;
        } else {
            return list.head.value;
        }
    }

    //delete
    public void delete() {
        list.head = null;
        list.tail = null;
        System.out.println("Successfully Deleted value");
    }
}
