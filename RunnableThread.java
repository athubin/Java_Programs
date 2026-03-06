// Java program to demonstrate the implementation of threads using Runnable Interface

import java.io.*;
import java.util.*;

class CNThread implements Runnable {            // Implementing Runnable Interface

    int from, to;

    public CNThread(int from, int to) {         // Constructor
        this.from = from;
        this.to = to;
    }

    public void run() {                         // Overriding run() method

        while (from != to) {
            System.out.print(from + "\n");

            if (from < to)
                from++;
            else
                from--;
        }
        System.out.print(from + "\n");
    }
}

class RunnableThread {

    public static void main(String args[]) {

        System.out.println("\nImplementing Threads using Runnable Interface");
        System.out.println("---------------------------------------------\n");

        CNThread p = new CNThread(1, 7);          // Creating CNThread Object
        CNThread q = new CNThread(7, 1);

        Thread t1 = new Thread(p);                // Creating Thread Object
        Thread t2 = new Thread(q);

        System.out.println("Before Threading...");
        t1.start();                               // Starting the Thread t1

        System.out.println("\nBetween Threading...");
        t2.start();                               // Starting the Thread t2 

        System.out.println("\nFinished...");
    }
}