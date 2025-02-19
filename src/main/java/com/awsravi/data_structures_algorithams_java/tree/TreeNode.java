package com.awsravi.data_structures_algorithams_java.tree;

import java.util.ArrayList;

public class TreeNode {
    String data;
    ArrayList<TreeNode> children;

    public TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode node) {
        this.children.add(node);
    }

    public String print(int level) {
        String result;
        result = "  ".repeat(level) + data + "\n";
        for (TreeNode child : this.children) {
            result += child.print(level + 1);
        }
        return result;
    }
}
