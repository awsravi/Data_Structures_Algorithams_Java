package com.awsravi.data_structures_algorithams_java.linkedlist.singlelinkedlist;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLinkedList(int valueNode) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = valueNode;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //Insert Method SingleLinkedList
    public void insertSingleLinkedList(int valueNode, int location) {
        Node node = new Node();
        node.value = valueNode;
        if (head == null) {
            createSingleLinkedList(valueNode);

        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = tail;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // Traversal SingleLinkedList
    public void traverseSingleLinkedList() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");

                }
                tempNode = tempNode.next;

            }
        }
        System.out.println("\n");
    }

    // Search for a Node
    public boolean searchSingleLinkedList(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.print("Found The Node at The Location : " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }


    //Deleting a node from SinglyLinkedList
    public void deleteSingleLinkedList(int location) {
        if (head == null) {
            System.out.println("The SLL does not exist");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    //  Delete Entire SinglyLinkedList
    public void deleteAll(Node node) {
        head = null;
        tail = null;
        System.out.println("The SLL deleted successfully");

    }
}
