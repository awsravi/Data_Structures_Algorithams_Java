package com.awsravi.data_structures_algorithams_java.queue.array;

public class Main {
    public static void main(String[] args) {

        QueueArray qa = new QueueArray(4);

        boolean d = qa.isFull();
        System.out.println(d);

        boolean e = qa.isEmpty();
        System.out.println(e);
        qa.enqueue(1);
        qa.enqueue(2);

        int dq = qa.dequeue();
        System.out.println("dq: " + dq);

        int eq = qa.dequeue();
        System.out.println("qd: " + eq);

        int rr = qa.peek();
        System.out.println("Peek  : " + rr);
        int rr1 = qa.peek();
        System.out.println("Peek : : " + rr1);

        qa.deletequeue();
    }
}
