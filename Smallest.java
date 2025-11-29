/*
Read 3 numbers from the keyboard. Find the minimum using a single statement.  
*/

import java.io.*;

class Smallest{
    public static void main(String args[]){
        int n1,n2,n3,s;
        System.out.println("Smallest Number\n-------------");
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter first number: ");
            n1 = Integer.parseInt(br.readLine());
            System.out.print("Enter second number: ");
            n2 = Integer.parseInt(br.readLine());
            System.out.print("Enter third number: ");
            n3 = Integer.parseInt(br.readLine());

            s = (n1 < n2) ? ((n1 < n3 ? n1 : n3)) : ((n2 < n3 ? n2 : n3));
            
            System.out.println("Smallest = " + s);
        }catch(Exception e){
            System.out.println("Error :" + e);
        }
    }
}