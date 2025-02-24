package com.awsravi.data_structures_algorithams_java.hashing.linearprobing;

public class Main {
    /*
    Linear Probing is a collision resolution technique in open addressing hashing.
    When a collision occurs (Note:two keys hash to the same index),
    the program searches for the next available slot in a linear sequence.
     */
    /*
    A hash function computes the index where the key should be placed.
    If the computed index is occupied, the program checks the next sequential index.
    If the table is full, it continues searching circularly (wrapping around the table).
    If load factor exceeds 0.75, the table size is doubled (Rehashing).
     */

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
