/*
Maximum of 3 numbers using 3 different logics 
*/

import java.io.*;
import java.util.*;

class Maximum{
    public static void main(String args[]){
        int n1,n2,n3,max = 0,ch;
        System.out.println("Maximum of 3 numbers\n-------------------");
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter first number: ");
            n1 = Integer.parseInt(br.readLine());
            System.out.print("Enter second number: ");
            n2 = Integer.parseInt(br.readLine());
            System.out.print("Enter third number: ");
            n3 = Integer.parseInt(br.readLine());
            System.out.println("\nFind maximum of 3 numbers using ");
            System.out.println("1. Using if-else checking\n2. Using ternery operator\n3. Using math.Max function");
            System.out.print("Enter your choice: ");
            ch = Integer.parseInt(br.readLine());
            switch(ch){
                case 1:
                    if(n1 > n2){
                        if(n1 > n3){
                            max = n1;
                        }
                        else{
                            if(n3 > n2){
                                max = n3;
                            }
                            else{
                                max = n2;
                            }
                        }
                    }
                    else{
                        if(n2 > n3){
                            max = n2;
                        }
                        else{
                            max = n3;
                        }
                    }
                    break;

                case 2:
                    max = (n1 > n2) ? ((n1 > n3 ? n1 : (n3 > n2 ? n3 : n2))) : ((n2 > n3) ? n2 : n3);
                    break;

                case 3:
                    max = Math.max(Math.max(n1,n2),n3);
                    break;

                default:
                    System.out.println("Invalid option");
            }
            System.out.println("Largest Number = " + max);
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
}