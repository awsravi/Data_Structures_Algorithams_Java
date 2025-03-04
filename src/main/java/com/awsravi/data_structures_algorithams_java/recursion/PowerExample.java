package com.awsravi.data_structures_algorithams_java.recursion;

public class PowerExample {
    /*
    Power:
    Exponentiation is the mathematical operation of raising a base number to the power of an exponent.
    The recursive approach simplifies this operation by breaking it down into smaller subproblems.
     */

    public static void main(String[] args) {
        PowerExample main = new PowerExample();
        var result = main.power(2, -2);
        System.out.println(result);
    }

    // How to calculate power of a number using recursion?

    public int power(int base, int exp) {
        if (exp < 0) {
            return -1;
        }
        if (exp == 0 || exp == 1) {
            return base;
        }
        return base * power(base, exp - 1);
    }
}
