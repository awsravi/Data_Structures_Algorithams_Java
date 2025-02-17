package com.awsravi.data_structures_algorithams_java.stack.linkedlist;

public class Main {
    public static void main(String[] args) {
        Stack_LinkedList newStack = new Stack_LinkedList();
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);

        boolean r = newStack.isEmpty();
        System.out.println(r);

        int delete = newStack.pop();
        System.out.println(delete);

        int r2 = newStack.peek();
        System.out.println(r2);
        int r3 = newStack.peek();
        System.out.println(r3);
        
        newStack.deleteStack();

    }
}
