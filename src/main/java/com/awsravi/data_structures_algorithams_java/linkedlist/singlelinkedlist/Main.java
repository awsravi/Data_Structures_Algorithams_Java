package com.awsravi.data_structures_algorithams_java.linkedlist.singlelinkedlist;

public class Main {
    public static void main(String[] args) {

        SingleLinkedList sLL = new SingleLinkedList();
        sLL.createSingleLinkedList(5);
        //This comment is createSingleLinkedList
        //System.out.println(sLL.head.value);

        sLL.insertSingleLinkedList(6, 1);
        // This comment is insertSingleLinkedList
        //System.out.println(sLL.head.next.value);

        sLL.insertSingleLinkedList(7, 2);
        // System.out.println(sLL.head.next.next.value);

        sLL.insertSingleLinkedList(8, 3);

        sLL.insertSingleLinkedList(9, 4);

        sLL.insertSingleLinkedList(10, 5);
        // System.out.println(sLL.head.next.next.next.value);

        // This comment is traverseSingleLinkedList
        sLL.traverseSingleLinkedList();

        sLL.searchSingleLinkedList(9);

        //sLL.deleteSingleLinkedList(4);

        sLL.traverseSingleLinkedList();

        sLL.deleteAll(sLL.head);
        //After Deleting Entire Node
        sLL.traverseSingleLinkedList();

    }

}
