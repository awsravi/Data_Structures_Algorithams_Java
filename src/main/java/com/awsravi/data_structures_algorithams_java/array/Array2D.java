package com.awsravi.data_structures_algorithams_java.array;

public class Array2D {
    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        int numRows = array.length;

        for (int i = 0; i < numRows; i++) {
            sum += array[i][i]; // Summing diagonal elements
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Diagonal Sum: " + sumDiagonalElements(matrix1));
        // Expected output: 1 + 5 + 9 = 15

        int[][] matrix2 = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        System.out.println("Diagonal Sum: " + sumDiagonalElements(matrix2));
        // Expected output: 10 + 50 + 90 = 150

        int[][] matrix3 = {
                {3, 5},
                {7, 9}
        };
        System.out.println("Diagonal Sum: " + sumDiagonalElements(matrix3));
        // Expected output: 3 + 9 = 12

        int[][] matrix4 = {
                {5}
        };
        System.out.println("Diagonal Sum: " + sumDiagonalElements(matrix4));
        // Expected output: 5 (only one element)
    }
}
