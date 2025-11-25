import java.io.*;

class ArraySort{
    public static void main(String args[]){
        int a[],n,i,j,temp;
        System.out.println("Sort an Array\n---------------");
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the value for n: ");
            n = Integer.parseInt(br.readLine());
            a = new int[n];
            System.out.println("Enter the elements in the array: ");
            for(i=0;i<n;i++){
                a[i] = Integer.parseInt(br.readLine());
            }
            System.out.print("\nArray before sorting: ");
            for(i=0;i<n;i++){
                System.out.print(a[i] + " ");
            }
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
        }catch(Exception e){
            System.out.println("Error : " + e);
        }
    }
}