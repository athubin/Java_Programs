/* Create a class for CString having a string data member and provide functions for read, 
display, compare(return Boolean value),add and concatenate. */

import java.io.*;
import java.util.*;

class CString {
    String str;

    // Read a string from user
    public void read() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = s.nextLine();
    }

    // Display the string
    public void display() {
        System.out.println("String: " + str);
    }

    // Compare two strings
    public boolean compare(CString b) {
        return str.equals(b.str);
    }

    // Add two strings and return a new CString object
    public CString add(CString b) {
        CString t = new CString();
        t.str = str + b.str;
        return t;
    }

    // using concat()
    public CString concatenate(CString b) {
        CString t = new CString();
        t.str = str.concat(b.str);
        return t;
    }
}

class CStringMain {
    public static void main(String args[]) {
        CString a = new CString();
        CString b = new CString();
        CString s;
        boolean c;
		int ch;

		Scanner sc = new Scanner(System.in);

		System.out.println("\nString functions\n---------------\n");

        // Read strings
        a.read();
        b.read();

        // Display strings
        a.display();
        b.display();

		while(true){

			System.out.println("\nWhich operation do you want to perform?");
			System.out.println("\n1. Compare\n2. Add strings\n3. Concatenate Strings\n4. Exit");
			System.out.print("Enter your choice: ");
			ch = sc.nextInt();

			switch(ch){
				case 1:
					// Compare
					c = a.compare(b);
					if(c)
						System.out.println("\nThe two strings are the same");
					else
						System.out.println("\nThe two strings are not the same");
					break;

				case 2:
					// Add strings (no space)
					System.out.println("\nConcatenated Strings using add():");
					s = a.add(b);
					s.display();
					break;

				case 3:
					// concatenate() demo
					System.out.println("\nUsing concatenate():");
					CString concatResult = a.concatenate(b);
					concatResult.display();
					break;

				case 4:
					System.out.println("Exiting...");
					return;

				default:
					System.out.println("Invalid option!");
			}
		}         
    }
}
