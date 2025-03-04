package com.awsravi.data_structures_algorithams_java.recursion;

public class SumofDigits {
    /*
    Recursion is a programming technique where a function calls itself to solve smaller instances of the
    problem until it reaches a base condition. In this program, recursion is used to compute the sum of the
    digits of a given positive integer.
     */
    /*
    The sum of the digits of a number is calculated by extracting each digit one by one, summing them up,
    and continuing the process until no digits are left. Recursion helps achieve this by repeatedly
    reducing the problem size.
     */
    public static void main(String[] args) {
        SumofDigits main = new SumofDigits();
        var result = main.sumofDigits(222);
        System.out.println(result);

    }

    //  How to find the sum of digits of a positive integer number using recursion

    public int sumofDigits(int n) {

        if (n == 0 || n < 0) {
            return 0;
        }
        return n % 10 + sumofDigits(n / 10);
    }

}
