// To perform arithmetic operations using object oriented concepts

import java.util.*;

class Num {
    int a;   // data member

    // Read a number
    public void read() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = s.nextInt();
    }

    // Display number
    public void disp() {
        System.out.println(a);
    }

    // Addition
    public void add(Num q) {
        System.out.println("\n" + a + " + " + q.a + " = " + (a + q.a));
    }

    // Subtraction
    public void sub(Num q) {
        System.out.println("\n" + a + " - " + q.a + " = " + (a - q.a));
    }

    // Multiplication
    public void mult(Num q) {
        System.out.println("\n" + a + " * " + q.a + " = " + (a * q.a));
    }

    // Division
    public void div(Num q) {
        if(q.a == 0) {
            System.out.println("\nError: Division by zero is not allowed!");
        } else {
            System.out.println("\n" + a + " / " + q.a + " = " + (a / q.a));
        }
    }
}

class MNum {
    public static void main(String args[]) {

        Num p = new Num();
        Num q = new Num();

        System.out.println("\nArithmetic Operations using Object-Oriented Concepts");
        System.out.println("----------------------------------------------------\n");

        p.read();
        q.read();

        System.out.println("\nThe numbers you entered:");
        System.out.print("First Number  = ");
        p.disp();
        System.out.print("Second Number = ");
        q.disp();

        Scanner s = new Scanner(System.in);
        int ch;

        while(true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            ch = s.nextInt();

            switch(ch) {
                case 1: 
                    p.add(q); 
                    break;
                case 2: 
                    p.sub(q); 
                    break;
                case 3: 
                    p.mult(q); 
                    break;
                case 4: 
                    p.div(q); 
                    break;
                case 5: 
                    System.out.println("Exiting..."); 
                    return;
                default: 
                    System.out.println("Invalid choice!");
            }
        }
    }
}
