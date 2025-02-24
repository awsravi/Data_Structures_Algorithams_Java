package com.awsravi.data_structures_algorithams_java.hashing.doublehashing;

public class Main {
    public static void main(String[] args) {

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
