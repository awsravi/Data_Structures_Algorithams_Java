package com.awsravi.data_structures_algorithams_java.recursion;

public class Fibonacci_Recursion_1 {
    public static void main(String[] args) {

        int n = 6;
        System.out.println("Fibonacci Series Recursion : " + fibonacci(n));
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + "  ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
