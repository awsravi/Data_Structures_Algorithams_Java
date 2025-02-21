package com.awsravi.data_structures_algorithams_java.tree.binaryheap;

public class BinaryHeap {
    public int array[];
    public int sizeOfTree;

    public BinaryHeap(int size) {

        array = new int[size + 1];
        this.sizeOfTree = 0;
        System.out.println("Binary Heap Has Created Successfully : " + size);
    }

    //isEmpty
    public boolean isEmpty() {
        if (sizeOfTree == 0) {
            return true;
        }
        return false;
    }

    //peek Method
    public Integer peek() {
        if (isEmpty()) {
            System.out.println("using Peek Binary Heap is Empty");
            return null;
        }
        return array[1];
    }

    public int sizeOfBHTree() {
        return sizeOfTree;
    }

    //Level order
    public void levelOrder() {
        for (int i = 1; i <= sizeOfTree; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("Level Order of BHTree !");
    }

    //Heap Tree Insert insertBottomToTop case
    public void heapIfyBottomToTop(int index, String heapType) {
        int parentIndex = index / 2;
        if (index <= 1) {
            return;
        }
        if (heapType == "min") {
            if (array[index] < array[parentIndex]) {
                int temp = array[index];
                array[index] = array[parentIndex];
                array[parentIndex] = temp;
            }
        } else if (heapType == "max") {
            if (array[index] > array[parentIndex]) {
                int temp = array[index];
                array[index] = array[parentIndex];
                array[parentIndex] = temp;
            }
        }
    }

    //Insert Insert Method
    public void insert(int value, String heapType) {
        array[sizeOfTree + 1] = value;
        sizeOfTree++;
        heapIfyBottomToTop(sizeOfTree, heapType);
        System.out.println("Inserted Successfully in BHTree : " + value);
    }

    //Heap Tree TopTo Bottom Case
    public void heapifyTopToBottom(int index, String heapType) {
        int left = index * 2;
        int right = index * 2 + 1;
        int swapChild = 0;
        if (sizeOfTree < left) {
            return;
        }
        if (heapType == "Max") {
            if (sizeOfTree == left) {
                if (array[index] < array[left]) {
                    int tmp = array[index];
                    array[index] = array[left];
                    array[left] = tmp;
                }
                return;
            } else {
                if (array[left] > array[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (array[index] < array[swapChild]) {
                    int tmp = array[index];
                    array[index] = array[swapChild];
                    array[swapChild] = tmp;
                }
            }
        } else if (heapType == "Min") {
            if (sizeOfTree == left) {
                if (array[index] > array[left]) {
                    int tmp = array[index];
                    array[index] = array[left];
                    array[left] = tmp;
                }
                return;
            } else {
                if (array[left] < array[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (array[index] > array[swapChild]) {
                    int tmp = array[index];
                    array[index] = array[swapChild];
                    array[swapChild] = tmp;
                }
            }
        }
        heapifyTopToBottom(swapChild, heapType);
    }

    public int extractHeadOfBP(String heapType) {
        if (isEmpty()) {
            return -1;
        } else {
            int extractedValue = array[1];
            array[1] = array[sizeOfTree];
            sizeOfTree--;
            heapifyTopToBottom(1, heapType);
            return extractedValue;
        }
    }

    //Delete Method
    public void deleteBHTree() {
        array = null;
        System.out.println("Deleted Successfull BHTree !");
    }

}
