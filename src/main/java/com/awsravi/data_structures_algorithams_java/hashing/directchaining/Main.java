package com.awsravi.data_structures_algorithams_java.hashing.directchaining;

public class Main {
    /*
    Direct chaining is a technique used to handle collisions in a hash table.
    It uses Linked Lists to store multiple values that hash to the same index.
    If two keys produce the same hash value, they are stored in a linked list at that index.
     */
    /*
    A hash function determines the index where a key-value pair is stored.
    If multiple keys map to the same index (collision occurs), they are added to a linked list at that index.
    Searching, inserting, and deleting operations involve traversing the linked list at the computed index.
     */

    public static void main(String[] args) {
        DirectChaining dc = new DirectChaining(12);
        dc.insertIntoHashTable("ravi");
        dc.insertIntoHashTable("k");
        dc.insertIntoHashTable("kumar");
        dc.insertIntoHashTable("vikram");
        dc.insertIntoHashTable("i");
        dc.insertIntoHashTable("thangalan");
        dc.insertIntoHashTable("ps");
        dc.displayHashTable();
        System.out.println();
        dc.searchFromHashTable("ravi");
        System.out.println();
        dc.deleteFromHashTable("ravi");

    }
}
