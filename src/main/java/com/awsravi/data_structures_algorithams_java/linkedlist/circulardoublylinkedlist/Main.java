package com.awsravi.data_structures_algorithams_java.linkedlist.circulardoublylinkedlist;

public class Main {
    public static void main(String[] args) {

        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();

        // Calling createCircularDoublyLinkedList
        cdll.createCircularDoublyLinkedList(1);
        System.out.println("\nCircular Doubly Linked List: " + cdll.head.value);

        // Calling Insert CircularDoublyLinkedList
        cdll.insertCircularDoublyLinkedList(4, 2);
        cdll.insertCircularDoublyLinkedList(5, 3);
        System.out.println("Insert : " + cdll.head.next.value);
        System.out.println("Insert : " + cdll.head.next.next.value);

        //Calling Traversal Method CircularDoublyLinkedList
        System.out.println("Traversal Methods -> below");
        cdll.traverseCircularDoublyLinkedList();

        //calling ReverseTraversalCircularDoublyLinkedList
        cdll.reverseTraversalCircularDoublyLinkedList();
        System.out.println();

        //Calling Search Method CircularDoublyLinkedList
        System.out.println("Search Method : below");
        cdll.searchCircularDoublyLinkedList(4);

        //Calling Delete Method CircularDoublyLinkedList

        System.out.println("Delete Method : below");
        cdll.deleteCircularDoublyLinkedList(3);
        cdll.traverseCircularDoublyLinkedList();

        //Calling Delete Method CircularDoublyLinkedList
        System.out.println("Delete Entire Node Method : below");
        cdll.deleteNodeCircularDoublyLinkedList();
        cdll.traverseCircularDoublyLinkedList();
    }

}
