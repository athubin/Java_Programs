// Java program to print odd and even numbers using threads

import java.io.*;
import java.util.*;
 
class OddThread implements Runnable {       // Thread to print odd numbers
    int n;

    public OddThread(int n) {
        this.n = n;
    }

    public void run() {                     // Overriding run() method
        for (int i = 1; i <= n; i += 2) {
            System.out.println("Odd  : " + i);
        }
    }
}

class EvenThread implements Runnable {     // Thread to print even numbers
    int n;

    public EvenThread(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 2; i <= n; i += 2) {
            System.out.println("Even : " + i);
        }
    }
}

class OddEvenThread {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.println("\nODD EVEN THREAD");
        System.out.println("---------------");
        System.out.print("\nEnter the value of n: ");
        int n = s.nextInt();

        OddThread odd = new OddThread(n);       // Creating OddThread Object
        EvenThread even = new EvenThread(n);    // Creating EvenThread Object

        Thread t1 = new Thread(odd);            // Creating Thread Object for odd
        Thread t2 = new Thread(even);           // Creating Thread Object for even

        System.out.println("\nBefore Threading...");
        t1.start();
        t2.start();
    }
}