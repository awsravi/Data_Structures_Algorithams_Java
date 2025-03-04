package com.awsravi.data_structures_algorithams_java.recursion;

public class DecimalToBinary {
    /*
    The process of converting a decimal number to binary involves repeatedly dividing the
    number by 2 and collecting the remainders. This is done recursively in the given program.
     */
    /*
    Binary representation of a number consists of only 0s and 1s. The decimal-to-binary
    conversion follows these steps:
    Divide the number (n) by 2.
    Store the remainder (n % 2).
    Recursively call the function with n / 2.
    Combine results by placing each remainder in its correct place value.
     */
    public static void main(String[] args) {
        DecimalToBinary main = new DecimalToBinary();
        var result = main.decimalToBinary((int) 1.5);
        System.out.println("DecimalToBinary : " + result);

    }

    // How to convert a number from Decimal to Binary using recursion
    public int decimalToBinary(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 2 + 10 * decimalToBinary(n / 2);
    }
}
