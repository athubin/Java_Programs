/*
A function takes an integer argument and returns the reverse of the same. Another 
function takes an integer argument and returns true or false if the number is a 
palindrome, using the above function.
*/

import java.io.*;
import java.util.*;

class Rev{
	public int reverse(int num){
		int r,sum=0,i;
		while(num > 0){
			r = num%10;
			sum = sum*10 + r;
			num = num/10;
		}
		return sum;
	}
	public boolean palindrome(int num){
		int n = reverse(num);
		if(n == num)
			return true;
		else
			return false;
	}
}

class PalindromeCheck{
	public static void main(String args[]){
		Rev r = new Rev();
		int num,revno;
		boolean result;
		Scanner s = new Scanner(System.in);
		System.out.println("\nPalindrome Check\n----------------");
		System.out.print("Enter a number: ");
		num = s.nextInt();
		revno = r.reverse(num);
		System.out.println("Reverse Number = " + revno);
		result = r.palindrome(num);
		if(result == true)
			System.out.println("The number " + num + " is a palindrome");
		else
			System.out.println("The number " + num + " is not a palindrome");
	}
}

			
		
		
		