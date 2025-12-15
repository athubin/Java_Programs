/*
Display from n - 1 and 1-n using recursive functions.  
*/

import java.util.*;

class Recursive {
    
    // function to display the numbers from n to 1
    public void displayDescending(int n) {
        if (n == 0)
            return;

        System.out.println(n);
        displayDescending(n - 1);         // recursive function call
    }

    // function to display the numbers from 1 to n
    public void displayAscending(int n) {
        if (n == 0)
            return;

        displayAscending(n - 1);         // recursive function call
        System.out.println(n);
    }
}

class Nrecursive {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Recursive Function");
        System.out.println("------------------");
        System.out.print("\nEnter value for n: ");
        int n = s.nextInt();

        Recursive r = new Recursive();

        System.out.println("\nDescending (n to 1):");
        r.displayDescending(n);

        System.out.println("\nAscending (1 to n):");
        r.displayAscending(n);
    }
}
