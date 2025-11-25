import java.io.*;

class ArraySearch{
	public static void main(String args[]){
		int a[],i,key,flag=1,n;
		System.out.println("\nSearch an element in an Array\n----------------------------");
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the value for n: ");
			n = Integer.parseInt(br.readLine());
			a = new int[n];
			System.out.print("Enter the elements in array: ");
			for(i=0;i<n;i++){
				a[i]= Integer.parseInt(br.readLine());
			}
			System.out.print("Enter the key element: ");
			key = Integer.parseInt(br.readLine());
			for(i=0;i<n;i++){
				if(key == a[i]){
					System.out.println("Element found at position " + (i+1));
					flag = 0;
					return;
				}
			}
			if(flag == 1)
				System.out.println("Element not found");
		}catch(Exception e){
			System.out.println("Error: " + e);
		}
	}
}
				
			
		