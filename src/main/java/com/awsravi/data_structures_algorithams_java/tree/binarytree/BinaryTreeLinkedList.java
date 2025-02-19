package com.awsravi.data_structures_algorithams_java.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLinkedList {
    public BinaryNode root;

    public BinaryTreeLinkedList() {
        this.root = null;
    }

    //Pre_Order
    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + "  ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + "  ");
        inOrder(node.right);
    }

    //postOrder
    public void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + "  ");
    }

    //LevelOrder
    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            //here you can use delete or poll
            BinaryNode node = queue.poll();
            System.out.print(node.value + "  ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    //Search
    public void search(String value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode node = queue.poll();
            if (value.equals(node.value)) {
                System.out.println("The value of " + value + " is found in the tree. ");
                return;
            } else {
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        System.out.println("The value of " + value + " is not found");
    }

    //Insert Method
    public void insert(String value) {
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if (root == null) {
            root = newNode;
            System.out.println("Inserted New Node At Root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.poll();
            if (presentNode.left == null) {
                presentNode.left = newNode;
                System.out.println("Inserted New Node At Left");
                break;
            } else if (presentNode.right == null) {
                presentNode.right = newNode;
                System.out.println("Inserted New Node At Right");
                break;
            } else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }

        }
    }

    //Get Deepest Node
    public BinaryNode deepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while (!queue.isEmpty()) {
            presentNode = queue.remove();
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    //Delete Deepest method
    public void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        BinaryNode previousNode = null;
        while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.left == null) {
                previousNode.right = null;
                return;
            } else if (presentNode.right == null) {
                previousNode.left = null;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }


    }

    public void delelteNodeApplyDeeppest(String value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                presentNode.value = deepestNode().value;
                deleteDeepestNode();
                System.out.println("Deleted Node Position Replaced With Value : " + presentNode.value);
                return;
            } else {
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
            System.out.println("Node Doesn't Exists");
        }
    }

    public void deleteEntireNode() {
        root = null;
        System.out.println("Deleted Node At Root Level");
        
    }
}


















