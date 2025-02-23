package com.awsravi.data_structures_algorithams_java.hashing.linearprobing;

import java.util.ArrayList;

public class LinearProbing {
    String[] hashTable;
    int usedCellNumber;

    LinearProbing(int size) {
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    public int modASCIIHashFunction(String str, int M) {
        char ch[];
        ch = str.toCharArray();
        int i, sum;
        for (sum = 0, i = 0; i < str.length(); i++) {
            sum = sum + ch[i];
        }
        return sum % M;
    }

    public double getLoadFactor() {
        double loadFactor = usedCellNumber * 1.0 / hashTable.length;
        return loadFactor;
    }

    //Rehash
    public void rehashKeys(String str) {
        usedCellNumber = 0;
        ArrayList<String> data = new ArrayList<>();
        for (String s : hashTable) {
            if (s != null) {
                data.add(s);
            }
        }
        data.add(str);
        hashTable = new String[hashTable.length * 2];
        for (String s : data) {
            //insert into hashtable
            insertHashTable(s);

        }
    }

    public void insertHashTable(String str) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            rehashKeys(str);
        } else {
            int index = modASCIIHashFunction(str, hashTable.length);
            for (int i = index; i < index + hashTable.length; i++) {
                int newIndex = 1 % hashTable.length;
                if (hashTable[newIndex] == null) {
                    hashTable[newIndex] = str;
                    System.out.println(" Inserted " + str + " into hash table Successfully" + newIndex);
                    break;
                } else {
                    System.out.println(newIndex + "That Position Already Occupied . Trying Next Empty Cell");
                }
            }
        }
        usedCellNumber++;
    }

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
}
