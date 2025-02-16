package com.awsravi.data_structures_algorithams_java.linkedlist.circularsinglelinkedlist;

public class Main {
    public static void main(String[] args) {

        CircularSingleLinkedList circularLinkedList = new CircularSingleLinkedList();
        circularLinkedList.createCircularLinkedList(4);
        // System.out.println("Create Circular Linked List: " + circularLinkedList.head.value);
        // System.out.println("Circular Linked List: " + circularLinkedList.head.next.value);
        // System.out.println("Circular Linked List: " + circularLinkedList.head.next.next.value);

        //Insert Circular linked List
        circularLinkedList.insertCircularLinkedList(5, 1);
        circularLinkedList.insertCircularLinkedList(6, 2);
        circularLinkedList.insertCircularLinkedList(7, 3);

        //System.out.println("Inserted New Circular Linked List: " + circularLinkedList.head.next.value);

        // Traversal Method Circular Linked List
        circularLinkedList.traverseCircularLinkedList();

        // Search Circular Linked List
        circularLinkedList.searchCircularLinkedList(3);
        circularLinkedList.traverseCircularLinkedList();

        //Delete Method Circular Linked List
        circularLinkedList.deleteCircularLinkedList(2);
        circularLinkedList.traverseCircularLinkedList();

        //Delete Node
        circularLinkedList.deleteCSLL();
        circularLinkedList.traverseCircularLinkedList();

    }
}
