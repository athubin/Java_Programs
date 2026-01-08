// Write a program to implement a user-defined Exception. 

import java.io.*;
import java.util.*;

class UDE extends Exception {			// user-defined Exception class
	String strError;
	public  UDE(){						// default constructor
		strError = "Unknown Error";
	}
	public UDE(String s) {     			// parameterized constructor
		strError = s;
	}
	public String showError() {			// method to return the error message
		return strError;
	}
}

class UDException {
	public static void main(String args[]){
		int a, b, c;
		System.out.println("\nUser Defined Exceptions");
		System.out.println("------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter numerator: ");
        a = sc.nextInt();
        System.out.print("Enter denominator: ");
        b = sc.nextInt();
        c = 0;
		try {
			if(b == 0)
				throw new UDE("Error: Denominator is ZERO");           // throw user-defined exception
			c = a / b;
			System.out.println("Result: " + c);
		}
		catch(UDE e){
			System.out.println(e.showError());			// catch block to handle user-defined exception
		}
	}
}