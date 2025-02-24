package com.awsravi.data_structures_algorithams_java.hashing.directchaining;

public class Main {
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
