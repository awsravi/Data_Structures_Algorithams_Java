package com.awsravi.data_structures_algorithams_java.hashing.quadratic;

public class Main {
    public static void main(String[] args) {
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
