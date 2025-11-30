/*
Program to display 2 numbers using command line arguments
*/

import java.io.*;
class CLAdisp{
	public static void main(String args[])
	{
		if(args.length != 2){
			System.out.println("Error: Incorrect number of arguments passed");
			System.out.println("Correct format: n1 n2");
			return;
		}
		int n1, n2;
		n1 = Integer.parseInt(args[0]);
		n2 = Integer.parseInt(args[1]);
		System.out.println("\nCommand Line Arguments");
		System.out.println("---------------------");
		System.out.println("Argument 1 = " + n1);
		System.out.println("Argument 2 = " + n2);
	}
}