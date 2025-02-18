package com.awsravi.data_structures_algorithams_java.recursion;

public class Fibonacci_Recursion {
    public static void main(String[] args) {
        Fibonacci_Recursion main = new Fibonacci_Recursion();
        int result = main.fibonacci(6);
        System.out.println(result);
    }

    public int fibonacci(int n) {
        //step3
        if (n < 0) {
            return -1;
        }
        //step 2
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
