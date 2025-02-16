package com.awsravi.data_structures_algorithams_java.linkedlist.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dLL = new DoublyLinkedList();
        dLL.createDoublyLinkedList(4);
        System.out.println(dLL.head.value);
    }
}
