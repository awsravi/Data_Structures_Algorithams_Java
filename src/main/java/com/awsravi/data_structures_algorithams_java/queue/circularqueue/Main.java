package com.awsravi.data_structures_algorithams_java.queue.circularqueue;

public class Main {
    public static void main(String[] args) {

        CircularQueue cq = new CircularQueue(4);

        cq.display();

        boolean result = cq.isEmpty();
        System.out.println(result);

        boolean full = cq.isFull();
        System.out.println(full);

        cq.enQueue(10);
        cq.enQueue(20);
        cq.enQueue(30);
        cq.enQueue(40);
        cq.enQueue(50);

        int removed = cq.deQueue();
        System.out.println("Dequeue method : " + removed);

        int peek = cq.peek();
        System.out.println("Front element (peek): " + peek);

        cq.deleteQueue();
    }
}
