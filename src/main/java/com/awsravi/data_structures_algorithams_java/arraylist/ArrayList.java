package com.awsravi.data_structures_algorithams_java.arraylist;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list.add(11);
        list.add(0, 0);
        System.out.println(list);

        //Accessing the Elements using get method
        System.out.println(list.get(4));
        System.out.println(list.get(0));
        System.out.println(list.size());

        //Traversal loop

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Traversal loop : " + list.get(i));
        }

        //Traversal using 2nd way

        for (Integer l : list) {
            System.out.println("ForEach Loop use : " + l);
        }

        // Traversal Iterator with while
        Iterator<Integer> lt = list.iterator();
        while (lt.hasNext()) {
            System.out.println("Iterator with while : " + lt.next());

        }

        //Search using forEach loop
        for (Integer l : list) {
            if (l.equals(4)) {
                System.out.println("The Element is Found At : ");
                break;
            }

        }
        //Search using IndexOf method
        int index = list.indexOf(4);
        System.out.println("The index of 4 is : " + index);

        //Delete
        list.remove(4);
        System.out.println("Final Index : " + list);
    }
}
