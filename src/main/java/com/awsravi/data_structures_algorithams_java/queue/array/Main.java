package com.awsravi.data_structures_algorithams_java.queue.array;

public class Main {
    public static void main(String[] args) {

        //Declared Size of Queue
        QueueArray qa = new QueueArray(4);

        boolean d = qa.isFull();
        System.out.println(d);

        boolean e = qa.isEmpty();
        System.out.println(e);

        //EnQueue Insertion
        qa.enqueue(1);
        qa.enqueue(2);
        qa.enqueue(3);
        qa.enqueue(4);
        
        //Display or Show the Queue
        qa.display();


        //DEQueue Deletion
        int dq = qa.dequeue();
        System.out.println("Deletion: " + dq);

        int eq = qa.dequeue();
        System.out.println("Deletion: " + eq);

        int rr = qa.peek();
        System.out.println("Peek  : " + rr);
        int rr1 = qa.peek();
        System.out.println("Peek : : " + rr1);

        qa.deletequeue();
    }
}
