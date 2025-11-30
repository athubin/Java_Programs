/*
Program to predict a secret number between 20 and 30 and count the number of attempts using do-while loop 
*/

import java.io.*;

class SecretNumber{
    public static void main(String args[]){
        int sn = 23, n;
        int count=0;
        System.out.println("Predict the secret number between 20 and 30\n-----------------------------------");
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            do{
                count++;
                System.out.print("Enter your prediction(between 20 and 30): ");
                n = Integer.parseInt(br.readLine());
                if(n == sn){
                    System.out.println("You guessed it right!");
                    break;
                }
            }while(count<10);
            System.out.print("No. of Attempts = " + count);
            if(count == 10)
                System.out.print("\nFailed to guess it right! Try again");
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
}