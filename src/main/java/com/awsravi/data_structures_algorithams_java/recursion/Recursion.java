package com.awsravi.data_structures_algorithams_java.recursion;

public class Recursion {

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        var rec = recursion.factorial(4);
        System.out.println(rec);
    }

    public int factorial(int n) {
        if (n < 1) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }


}
