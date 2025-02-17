package com.awsravi.data_structures_algorithams_java.stack.array;

public class Main {
    public static void main(String[] args) {
        Stack_UsingArray newStack = new Stack_UsingArray(4);

        boolean result = newStack.isEmpty();
        System.out.println(result);

        boolean full = newStack.isFull();
        System.out.println(full);

        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);

        int result1 = newStack.pop();
        System.out.println("Pop is removed the last Element : " + result1);
        int result2 = newStack.pop();
        System.out.println("Pop is removed the last Element : " + result2);

        System.out.println(newStack.isEmpty());

        int result3 = newStack.peek();
        System.out.println("Peek is print the last Element : " + result3);
        int result4 = newStack.peek();
        System.out.println("Peek is print the last Element : " + result4);

        newStack.delete(1);
        newStack.delete();

        System.out.println(newStack.isEmpty());

    }
}
