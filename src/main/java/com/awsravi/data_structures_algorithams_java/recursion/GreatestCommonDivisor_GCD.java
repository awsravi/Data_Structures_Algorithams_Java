package com.awsravi.data_structures_algorithams_java.recursion;

public class GreatestCommonDivisor_GCD {
    /*
    The Greatest Common Divisor (GCD) of two numbers is the largest number that divides both
    numbers without leaving a remainder. The recursive approach uses Euclid's Algorithm,
    which efficiently finds the GCD of two numbers.
     */

    /*
    Euclid’s Algorithm:
    Search it any browser
     */
    public static void main(String[] args) {
        GreatestCommonDivisor_GCD main = new GreatestCommonDivisor_GCD();
        var result = main.gcd(-8, 4);
        System.out.println(result);
    }

    // How to find GCD ( Greatest Common Divisor) of two numbers using recursion?
    public int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
