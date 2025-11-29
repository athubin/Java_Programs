/*
Program to demonstrate Bitwise logical operators, left shift, and right shift 
operators.
*/

import java.io.*;

class BitwiseOp{
    public static void main(String args[]){
        int n1,n2,ch;
        System.out.println("Bitwise operators\n-------------");
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter first number: ");
            n1 = Integer.parseInt(br.readLine());
            System.out.print("Enter second number: ");
            n2 = Integer.parseInt(br.readLine());
            System.out.println("Which operation do you want to perform ? ");
            System.out.println("1. Bitwise AND\n2. Bitwise OR\n3. Bitwise XOR\n4. Bitwise NOT\n5. Bitwise Left Shift\n6. Bitwise Right Shift");
            System.out.print("Enter your choice: ");
            ch = Integer.parseInt(br.readLine());
            switch(ch){
                case 1:
                    System.out.println(n1 + " & " + n2 + " = " + (n1 & n2));
                    break;

                case 2:
                    System.out.println(n1 + " | " + n2 + " = " + (n1 | n2));
                    break;

                case 3:
                    System.out.println(n1 +" ^ " + n2 + " = " + (n1 ^ n2));
                    break;

                case 4:
                    System.out.println("~" + n1 + " = " + ~n1); 
                    System.out.println("~" + n2 + " = " + ~n2);
                    break;

                case 5:
                    System.out.println(n1 + " << " + n2 + " = " + (n1 << n2));
                    break;

                case 6:
                    System.out.println(n1 + " >> " + n2 + " = " + (n1 >> n2));
                    break;

                default:
                    System.out.println("Invalid Option");
            }
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
}