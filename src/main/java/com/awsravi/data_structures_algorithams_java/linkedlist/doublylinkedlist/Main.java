package com.awsravi.data_structures_algorithams_java.linkedlist.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dLL = new DoublyLinkedList();
        //Create DoublyLinkedList
        //dLL.createDoublyLinkedList(1);
        //System.out.println(dLL.head.value);

        //Insert Method DoublyLinkedList
        dLL.insertDoublyLinkedList(2, 0);
        dLL.insertDoublyLinkedList(3, 1);
        dLL.insertDoublyLinkedList(4, 2);
        dLL.insertDoublyLinkedList(5, 3);
        // System.out.println(dLL.head.value);
        // System.out.println(dLL.head.next.value);
        // System.out.println(dLL.head.next.next.value);
        // System.out.println(dLL.head.next.next.next.value);

        //Traversal Method DoublyLinkedList
        dLL.traversalDoublyLinkedList();

        // Reverse Traversal DoublyLinkedList
        // dLL.reverseTraversalDoublyLinkedList();

        //Search Method DoublyLinkedList
        //dLL.searchDoublyLinkedList(4);

        // Delete Method DoublyLinkedList
        dLL.deleteDoublyLinkedList(1);
        dLL.traversalDoublyLinkedList();

        //Delete Entire Node Method DoublyLinkedList
        dLL.deleteEntireNodeDoublyLinkedList();
        dLL.traversalDoublyLinkedList();
    }
}
