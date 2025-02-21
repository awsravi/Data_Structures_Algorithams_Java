package com.awsravi.data_structures_algorithams_java.tree.binaryheap;

public class Main {
    public static void main(String[] args) {
        BinaryHeap bh = new BinaryHeap(5);

        System.out.println("Heap Size: " + bh.sizeOfBHTree());
        bh.levelOrder();

        bh.insert(10, "Min");
        bh.insert(5, "Min");
        bh.insert(15, "Min");
        bh.insert(1, "Min");

        System.out.println("\nHeap after insertion:");
        bh.levelOrder();

        System.out.println("\nExtracting head:");
        bh.extractHeadOfBP("Min");

        System.out.println("\nHeap after extraction:");
        bh.levelOrder();

        System.out.println("\nExtracting Delete :");
        bh.deleteBHTree();
        
    }
}
