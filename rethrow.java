// Program to demonstrate re-throwing an exception and finally block

import java.util.*;

class Division {       // class containing method that may re-throw exception

    void divide(int a, int b) {        // method that may throw ArithmeticException
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught in Division class");

            throw e;        // Re-throwing the exception
        }
        finally {           // Finally block in Division class
            System.out.println("Finally block in Division class executed");
        }
    }
}

class RethrowDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Division d = new Division();        // Creating object of Division class

        System.out.println("\nDemonstration of re-throwing an exception and finally block");
        System.out.println("-----------------------------------------------------------");

        try {
            System.out.print("\nEnter two integers: ");
            int x = sc.nextInt();
            int y = sc.nextInt();

            d.divide(x, y);     // Calling divide method which may re-throw exception
        }
        catch (ArithmeticException e) {
            // Handling re-thrown exception
            System.out.println("Exception re-caught in main(): Division by zero");
        }
        finally {
            // Finally block in main
            System.out.println("Finally block in main method executed");
            sc.close();
        }
    }
}
