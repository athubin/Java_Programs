/*
Read two numbers and display the output in the form of  ‘Sum of 2 and 3 is 5’ 
*/

import java.io.*;

class readSum{
	public static void main(String args[]){
		int a,b,sum;
		System.out.println("Sum of 2 Numbers\n----------------");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.print("Enter first number: ");
			a = Integer.parseInt(br.readLine());
			System.out.print("Enter second number: ");
			b = Integer.parseInt(br.readLine());
			sum = a+b;
			System.out.println("Sum of " + a + " and " + b + " is " + sum);
		}
		catch(Exception e){
			System.out.println("Error: " + e);
		}
	}
}