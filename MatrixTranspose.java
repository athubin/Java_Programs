import java.io.*;

class MatrixTranspose{
    public static void main(String args[]){
        int a[][], n, m, i, j;
        System.out.println("\nMatrix Transpose\n------------");
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the number of rows: ");
            n = Integer.parseInt(br.readLine());
            System.out.print("Enter the number of columns: ");
            m = Integer.parseInt(br.readLine());
            a = new int[n][m];

            System.out.println("Enter the elements of matrix: ");
            for(i=0;i<n;i++){
                for(j=0;j<m;j++){
                    a[i][j] = Integer.parseInt(br.readLine());
                }
            }

            System.out.println("\nMatrix");
            for(i=0;i<n;i++){
                for(j=0;j<m;j++){
                    System.out.print(a[i][j]  + " ");
                }
                System.out.println("\n");
            }

            System.out.println("Transpose Matrix");
            for(i=0;i<m;i++){
                for(j=0;j<n;j++){
                    System.out.print(a[j][i]  + " ");
                }
                System.out.println("\n");
            }
        }catch(Exception e){
            System.out.println("Error : " + e);
        }
    }
}