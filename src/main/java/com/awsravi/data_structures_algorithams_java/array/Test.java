package com.awsravi.data_structures_algorithams_java.array;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("Inside the Try Block : 1.");
            System.exit(1);
            System.out.println("Inside the Try Block : 2.");
        } finally {
            notification();
            System.out.println("Inside the Finally Block !");
        }
    }

    public static void notification() {
        System.out.println("Inside the Notification Block !");
    }
}
