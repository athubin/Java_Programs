//Program to perform search and sort in an array

import java.io.*;

class SearchAndSort{
    public static void main(String args[]){
        int a[],n,i,j,temp;
        int key,m,l=0,h,pos=-1;
        System.out.println("\nSort and Search Array\n--------------------");
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the value for n: ");                // get the number of elements in array
            n = Integer.parseInt(br.readLine());
            a = new int[n];                                            // initialize the array
            System.out.println("Enter the elements in the array: ");
            for(i=0;i<n;i++){
                a[i] = Integer.parseInt(br.readLine());           // read the elements in the array
            }
            System.out.print("\nArray before sorting: ");
            for(i=0;i<n;i++)
                System.out.print(a[i] + " ");
            
            // sort the array

            for(i=0;i<n;i++){
                for(j=i+1;j<n;j++){
                    if(a[i] > a[j]){
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            System.out.print("\nArray after sorting: ");
            for(i=0;i<n;i++){
                System.out.print(a[i] + " ");
            }

            System.out.print("\nEnter an element to search: ");
            key = Integer.parseInt(br.readLine());            // get the key element to search

            // perform binary search
            h = n - 1;
            while(l<=h){
                m = (l+h)/2;
                if(a[m] == key){
                    pos = m+1;
                    break;
                }
                else if(key < a[m])
                    h=m-1;
                else   
                    l = m+1;
            }

            // display the search result

            if(pos == -1)
                System.out.println("The element " + key + " is not found");
            else
                System.out.println("Element found at position " + pos);
        }catch(Exception e){
            System.out.println("Error : " + e);
        }
    }
}