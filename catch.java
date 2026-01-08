// Program to demonstrate multiple catch statements using predefined exceptions

import java.util.*;

class catchDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDemonstration of Multiple Catch Blocks");
        System.out.println("--------------------------------------");

        System.out.print("\nEnter two integers (numerator and denominator): ");

        try {
            // Reading integer inputs
            int numerator = scanner.nextInt();
            int denominator = scanner.nextInt();
            int result = numerator / denominator;

            // Display result
            System.out.println("Result: " + result);
        }

        // Catches invalid input (non-integer values)
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        }

        // Catches division by zero error
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        // Catches any other unexpected exception
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        // finally block executes whether exception occurs or not
        finally {
            // Closing the Scanner resource
            scanner.close();
        }
    }
}
