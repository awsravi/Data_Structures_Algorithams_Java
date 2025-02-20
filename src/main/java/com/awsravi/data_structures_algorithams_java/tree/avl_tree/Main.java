package com.awsravi.data_structures_algorithams_java.tree.avl_tree;

public class Main {
    public static void main(String[] args) {
        AVL_BinaryTree avlBinaryTree = new AVL_BinaryTree();

        avlBinaryTree.insert(5);
        avlBinaryTree.insert(10);
        avlBinaryTree.insert(15);
        avlBinaryTree.insert(20);
        avlBinaryTree.levelOrder();

        System.out.println();
        System.out.println("AVL_BinaryTree Binary Tree: Preorder Traversal");
        avlBinaryTree.preOrder(avlBinaryTree.root);

        System.out.println();
        System.out.println("AVL_BinaryTree Binary Tree: Inorder Traversal");
        avlBinaryTree.inOrder(avlBinaryTree.root);

        System.out.println();
        System.out.println("AVL_BinaryTree Binary Tree: Postorder Traversal");
        avlBinaryTree.postOrder(avlBinaryTree.root);

        System.out.println();
        System.out.println("AVL_BinaryTree Binary Tree: Level Order Traversal");
        avlBinaryTree.levelOrder();

        System.out.println();
        avlBinaryTree.search(avlBinaryTree.root, 15);

        System.out.println();
        avlBinaryTree.delete(20);

        avlBinaryTree.levelOrder();

        System.out.println();
        avlBinaryTree.deleteAVL();
    }
}
