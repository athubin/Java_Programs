import java.io.*;

class CheckPrime{
    public static void main(String args[]){
        int n,i,flag=0;
        System.out.println("Check whether a number is prime or not\n---------------------------------");
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a number: ");
            n = Integer.parseInt(br.readLine());
            for(i=2;i<n/2;i++){
                if(n%i == 0){
                    System.out.println(n + " is not a prime number");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                System.out.println(n + " is a prime number");
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
}