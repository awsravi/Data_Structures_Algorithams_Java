package com.awsravi.data_structures_algorithams_java.hashing.quadratic;

public class Main {
    public static void main(String[] args) {
        /*
        Quadratic Probing is an open addressing collision resolution technique in hashing.
        It solves collisions by probing (searching) for the next available slot using a quadratic function instead of linear searching.
         */
        /*
        A hash function computes the index where the key should be placed.
        If the index is occupied, the program searches for an empty slot using a quadratic formula.
        newIndex=(index+(1)Sqere) % tableSize
        If the table is 75% full, it doubles the size (rehashing).
         */
        /*
        If a key hashes to index 5, but hashTable[5] is occupied, Quadratic Probing checks:
        First probe: newIndex = (5 + 1²) % size = 6
        Second probe: newIndex = (5 + 2²) % size = 9
        Third probe: newIndex = (5 + 3²) % size = 14
        Note:This spreads elements better than Linear Probing, reducing clustering.
         */

        QuadraticProbing quadraticProbing = new QuadraticProbing(14);
        quadraticProbing.insertInHashTable("ravi");
        quadraticProbing.insertInHashTable("k");
        quadraticProbing.insertInHashTable("kumar");
        quadraticProbing.insertInHashTable("vikram");
        quadraticProbing.insertInHashTable("i");
        quadraticProbing.insertInHashTable("mr.k");
        quadraticProbing.displayHashTable();

    }
}
