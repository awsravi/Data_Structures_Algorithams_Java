package com.awsravi.data_structures_algorithams_java.hashing;

import java.util.LinkedList;

public class DirectChaining {
    LinkedList<String>[] hashTable;
    int maxChainSize = 5;

    DirectChaining(int size) {
        hashTable = new LinkedList[size];
    }

    //Hash-Function
    public int modASCIIHashFunction(String str, int M) {
        char ch[];
        ch = str.toCharArray();
        int i, sum;
        for (sum = 0, i = 0; i < str.length(); i++) {
            sum = sum + ch[i];
        }
        return sum % M;
    }

    //Insert method use Hashing
    public void insertIntoHashTable(String str) {
        int newIndex = modASCIIHashFunction(str, hashTable.length);
        if (hashTable[newIndex] == null) {
            hashTable[newIndex] = new LinkedList<>();
            hashTable[newIndex].add(str);
        } else {
            hashTable[newIndex].add(str);
        }
    }

    //Display the hashTable values
    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("Hash table is empty");
            return;
        } else {
            System.out.println("--------HashTable--------");
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("Index " + i + ", Key: " + hashTable[i]);
            }
        }
    }

    //Search method use Hashing
    public boolean searchFromHashTable(String str) {
        int newIndex = modASCIIHashFunction(str, hashTable.length);
        if (hashTable[newIndex] != null && hashTable[newIndex].contains(str)) {
            System.out.println("Searched " + str + " from " + hashTable[newIndex]);
            return true;
        } else {
            System.out.println("Searched Key " + str + " Not Found in HashTable ");
            return false;
        }
    }

    //Delete Method use Hashing
    public void deleteFromHashTable(String str) {
        int newIndex = modASCIIHashFunction(str, hashTable.length);
        boolean result = searchFromHashTable(str);
        if (result == true) {
            hashTable[newIndex].remove(str);
            System.out.println("Deleted " + str + " Successfully " + hashTable[newIndex]);
        } else {
            System.out.println("Searched Key " + str + " Not Found in HashTable ");

        }
    }

}
