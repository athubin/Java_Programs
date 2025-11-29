/*
Display second smallest element in an array  
*/

import java.io.*;

class SecondSmallest{
	public static void main(String args[]){
		int a[],n,i,min, smin;
		System.out.println("\nSecond Smallest Element in an Array\n-----------------------------");
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter value for n: ");
			n = Integer.parseInt(br.readLine());
			a = new int[n];
			System.out.println("Enter the elements in array: ");
			for(i=0;i<n;i++){
				a[i] = Integer.parseInt(br.readLine());
			}
			min = a[0];
			for(i=0;i<n;i++){
				if(a[i] < min)
					min = a[i];
			}
			smin = a[0];
			for(i=0;i<n;i++){
				if(a[i] < smin && a[i] > min)
					smin = a[i];
			}
			for(i=0;i<n;i++){
				System.out.print(a[i] + " ");
			}
			System.out.println("\nSecond Smallest Element = " + smin);
		}catch(Exception e){
			System.out.println("Error : " + e);
		}
	}
}
			


