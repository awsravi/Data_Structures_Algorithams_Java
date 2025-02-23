package com.awsravi.data_structures_algorithams_java.tree.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    public TrieNode root;
    Map<Character, TrieNode> children;
    boolean endOfString;

    public TrieNode() {
        children = new HashMap<>();
        endOfString = false;
    }

}
