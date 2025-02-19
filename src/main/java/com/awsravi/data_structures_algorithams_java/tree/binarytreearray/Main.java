package com.awsravi.data_structures_algorithams_java.tree.binarytreearray;

public class Main {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray(10);

        boolean isfull = bta.isFull();
        System.out.println("BinaryTreeArray : " + isfull);

        bta.insert("A1");
        bta.insert("A2");
        bta.insert("A3");
        bta.insert("A4");
        bta.insert("A5");
        bta.insert("A6");
        bta.insert("A7");
        bta.insert("A8");
        bta.insert("A9");

        System.out.println("BinaryTreeArray : PreOrder Method");
        bta.preOrder(1);

        System.out.println();
        bta.inOrder(1);

        System.out.println();
        bta.postOrder(1);

        System.out.println();
        bta.levelOrder();

        System.out.println();
        bta.search("A4");

        System.out.println();
        bta.delete("A5");

        System.out.println();
        bta.levelOrder();

        System.out.println();
        bta.deleteBt();
    }
}
