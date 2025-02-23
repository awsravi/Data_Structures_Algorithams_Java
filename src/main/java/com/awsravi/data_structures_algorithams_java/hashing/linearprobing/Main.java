package com.awsravi.data_structures_algorithams_java.hashing.linearprobing;

public class Main {
    public static void main(String[] args) {
        LinearProbing lp = new LinearProbing(14);
        lp.insertHashTable("ravi");
        lp.insertHashTable("k");
        lp.insertHashTable("kumar");
        lp.insertHashTable("vikram");
        lp.insertHashTable("i");
        lp.insertHashTable("thangalan");
        lp.insertHashTable("ps");
        lp.displayHashTable();
    }
}
