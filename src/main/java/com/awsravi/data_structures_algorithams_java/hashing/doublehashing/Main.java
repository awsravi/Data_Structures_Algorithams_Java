package com.awsravi.data_structures_algorithams_java.hashing.doublehashing;

public class Main {
    public static void main(String[] args) {

        /*
        Double Hashing is an advanced collision resolution technique that uses two independent hash functions to minimize clustering.
         */
        /*
        The primary hash function (h1(key)) finds an initial index
        If the index is occupied, a second hash function (h2(key)) generates a probe sequence
        double check 2:  newIndex=(h1(key)+i×h2(key))modtableSize
        This method spreads elements better than Linear Probing or Quadratic Probing, reducing clustering
         */

        DoubleHashing doubleHashing = new DoubleHashing(8);
        doubleHashing.insertKeyInHashTable("jai");
        doubleHashing.insertKeyInHashTable("karya");
        doubleHashing.insertKeyInHashTable("siddi");
        doubleHashing.insertKeyInHashTable("hanuman");
        doubleHashing.insertKeyInHashTable("arunachala");
        doubleHashing.insertKeyInHashTable("siva");
        doubleHashing.displayHashTable();

    }
}

