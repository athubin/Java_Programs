/*
Interchanging the values of 2 variables in three logics
*/

import java.io.*;

class Interchange{
    public static void main(String args[]){
        int n1,n2,temp,ch;
        System.out.println("\nInterchange values of 2 variables\n---------------------------");
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter first number: ");
            n1 = Integer.parseInt(br.readLine());
            System.out.print("Enter second number: ");
            n2 = Integer.parseInt(br.readLine());
            System.out.println("First Number = " + n1);
            System.out.println("Second Number = " + n2);
            System.out.println("\nInterchange the values by");
            System.out.println("1. Swapping using temporary variable\n2. Using arithmetic operators\n3. Using bitwise XOR operator");
            System.out.print("Enter your choice: ");
            ch = Integer.parseInt(br.readLine());
            switch(ch){
                case 1:
                    temp = n1;
                    n1 = n2;
                    n2 = temp;
                    break;

                case 2:
                    n1 = n1 + n2;
                    n2 = n1 - n2;
                    n1 = n1 - n2;
                    break;

                case 3:
                    n1 = n1 ^ n2;
                    n2 = n1 ^ n2;
                    n1 = n1 ^ n2;
                    break;

                default:
                    System.out.println("Invalid option");
            }
            System.out.println("\nNumbers After Sorting");
            System.out.println("Fisrt Number = " + n1);
            System.out.println("Second Number = " + n2);
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
}