package com.awsravi.data_structures_algorithams_java.linkedlist.circulardoublylinkedlist;

public class CircularDoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    int size;


    //Create Method CircularDoublyLinkedList
    public DoublyNode createCircularDoublyLinkedList(int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = head;
        newNode.next = newNode;
        newNode.prev = newNode;
        size = 1;
        return head;
    }

    //Insert Method CircularDoublyLinkedList
    public void insertCircularDoublyLinkedList(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (head == null) {
            createCircularDoublyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            head.next = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            tempNode.next.prev = newNode;
        }
        size++;
    }

    //Traversal Method CircularDoublyLinkedList
    public void traverseCircularDoublyLinkedList() {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("Dose not Exist!");
        }
        System.out.println();
    }

    //ReverseTraversal Method CircularDoublyLinkedList
    public void reverseTraversalCircularDoublyLinkedList() {
        if (head != null) {
            DoublyNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" <- ");
                }
                tempNode = tempNode.prev;
            }
        } else {
            System.out.println("Dose not Exist!");
        }
    }

    //Search Method CircularDoublyLinkedList
    public boolean searchCircularDoublyLinkedList(int nodeValue) {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("The Node is Found Node Location : " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Dose not Exist!");
        return false;
    }

    //Delete Method CircularDoublyLinkedList
    public void deleteCircularDoublyLinkedList(int location) {
        if (head == null) {
            System.out.println("Dose not Exist!");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head.prev = null;
                tail.next = null;
                head = tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
                size--;

            }
        } else if (location >= size) {
            if (size == 1) {
                head.prev = null;
                head.next = null;
                head = tail = null;
                size--;
            } else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
                size--;
            }
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;

            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    //Delete Entire Node
    public void deleteNodeCircularDoublyLinkedList() {
        DoublyNode tempNode = head;
        for (int i = 0; i < size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("The Node Has been Deleted!");
    }
}
