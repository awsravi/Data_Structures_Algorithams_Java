package com.awsravi.data_structures_algorithams_java.tree.trie;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("R");
        trie.insert("RA");
        trie.insert("RAV");
        trie.insert("RAVI");

        trie.search("RA");
        trie.delete("RA");
        trie.search("RA");
    }
}
