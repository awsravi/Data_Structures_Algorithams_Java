package com.awsravi.data_structures_algorithams_java.tree;

public class Main {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode wine = new TreeNode("Wine");
        TreeNode bear = new TreeNode("Bear");
        drinks.addChild(hot);
        hot.addChild(tea);
        hot.addChild(coffee);

        drinks.addChild(cold);
        cold.addChild(wine);
        cold.addChild(bear);
        System.out.println(drinks.print(0));

    }
}
