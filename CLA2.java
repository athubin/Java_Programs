/*
Program to  demonstrate arithmetic operation using command line arguments
*/

import java.io.*;
class CLA2{
	public static void main(String args[])
	{
		if(args.length != 3){
			System.out.println("\nError: Not enough arguments");
			System.out.println("Correct format: n1 n2 op");
			System.out.println("op: 0 - ADD || 1 - SUB || 2 - MUL || 3 - DIV || 4 - MOD");
			return;
		}
		int n1, n2, result, a;
		n1 = Integer.parseInt(args[0]);
		n2 = Integer.parseInt(args[1]);
		a = Integer.parseInt(args[2]);
		
		switch(a){
			case 0:
				System.out.println("\nAddition");
				result = n1 + n2;
				break;
			case 1:
				System.out.println("\nSubtraction");
				result = n1 - n2;
				break;
			case 2:
				System.out.println("\nMultiplication");
				result = n1 * n2;
				break;
			case 3:
				System.out.println("\nDivision");
				if(n2 == 0){
					System.out.println("Error: Division by zero is not possible");
					return;
				}			
				result = n1 / n2;
				break;
			case 4:
				System.out.println("\nModulus");
				if(n2 == 0){
					System.out.println("Error: Modulo by zero is not possible");
					return;
				}
				result = n1 % n2;
				break;
			default:
				System.out.println("\nInvalid Option");
				return;
		}
		System.out.println("Result = "+ result);
	}
}