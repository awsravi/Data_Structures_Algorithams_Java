package com.awsravi.data_structures_algorithams_java.queue.linkedlist;

public class Main {
    public static void main(String[] args) {
        QueueLinkedList qll = new QueueLinkedList();

        boolean isempty = qll.isEmpty();
        System.out.println(isempty);

        qll.enqueue(1);
        qll.enqueue(2);
        qll.enqueue(3);
        qll.enqueue(4);
        qll.enqueue(5);

        int delete = qll.dequeue();
        System.out.println(delete);

        //peek method
        int firstelemet = qll.peek();
        System.out.println(firstelemet);
        int firstelemet1 = qll.peek();
        System.out.println(firstelemet1);

        qll.delete();

    }
}
