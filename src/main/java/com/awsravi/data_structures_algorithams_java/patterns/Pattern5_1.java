package com.awsravi.data_structures_algorithams_java.patterns;

public class Pattern5_1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i <= n ? i : 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
