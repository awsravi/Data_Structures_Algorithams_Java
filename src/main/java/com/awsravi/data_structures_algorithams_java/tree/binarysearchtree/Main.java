package com.awsravi.data_structures_algorithams_java.tree.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println(bst.hashCode());

        bst.insert(70);
        bst.insert(50);
        bst.insert(90);
        bst.insert(30);
        bst.insert(60);
        bst.insert(80);
        bst.insert(100);
        bst.insert(20);
        bst.insert(40);

        System.out.println();
        bst.preOrder(bst.root);

        System.out.println();
        bst.inOrder(bst.root);

        System.out.println();
        bst.postOrder(bst.root);

        System.out.println();
        bst.search(bst.root, 50);

        System.out.println();
        bst.levelOrder();

        System.out.println();
        bst.deleteNode(bst.root, 80);

        System.out.println();
        bst.levelOrder();

        System.out.println();
        bst.deleteBST();

        System.out.println("BinarySearchTree Successfully Completed With : " + bst.hashCode());
        
    }
}
