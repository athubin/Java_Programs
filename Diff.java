/*
Program to find difference of two numbers using while loop
*/

import java.io.*;

class Diff{
    public static void main(String args[]){
        int m,n,count=0,temp;
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter value for m: ");
            m = Integer.parseInt(br.readLine());
            System.out.print("Enter value for n: ");
            n = Integer.parseInt(br.readLine());
            temp = m;
            while(m!=n){
                count++;
                if(m < n){
                    m++;
                }
                else{
                    m--;
                }
            }
            System.out.println("Difference between " + temp + " and " + n + " is " + count);
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
}