package com.awsravi.data_structures_algorithams_java.linkedlist.doublylinkedlist;


public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    public DoublyNode createDoublyLinkedList(int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;

    }

}
