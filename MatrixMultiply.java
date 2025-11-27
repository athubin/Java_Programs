
import java.io.*;

class MatrixMultiply{
    public static void main(String args[]){
        int a[][], b[][], c[][], n, m, p, q, i, j, k;
        System.out.println("\nMatrix Multiplication\n---------------");
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Matrix 1");
            System.out.print("Enter the number of rows: ");
            n = Integer.parseInt(br.readLine());
            System.out.print("Enter the number of columns: ");
            m = Integer.parseInt(br.readLine());
            a = new int[n][m];

            System.out.println("Matrix 2");
            System.out.print("Enter the number of rows: ");
            p = Integer.parseInt(br.readLine());
            System.out.print("Enter the number of columns: ");
            q = Integer.parseInt(br.readLine());
            b = new int[p][q];

            if(m!=p){
                System.out.println("Error: The matrices could not be multiplied");
                return;
            }

            System.out.println("Enter the elements of Matrix 1: ");
            for(i=0;i<n;i++){
                for(j=0;j<m;j++){
                    a[i][j] = Integer.parseInt(br.readLine());
                }
            }

            System.out.println("Enter the elements of Matrix 2: ");
            for(i=0;i<p;i++){
                for(j=0;j<q;j++){
                    b[i][j] = Integer.parseInt(br.readLine());
                }
            }

            System.out.println("\nMatrix 1");
            for(i=0;i<n;i++){
                for(j=0;j<m;j++){
                    System.out.print(a[i][j]  + " ");
                }
                System.out.println("\n");
            }

            System.out.println("\nMatrix 1");
            for(i=0;i<p;i++){
                for(j=0;j<q;j++){
                    System.out.print(b[i][j]  + " ");
                }
                System.out.println("\n");
            }

            c = new int[n][q];
            System.out.println("\nProduct Matrix");
            for(i=0;i<n;i++){
                for(j=0;j<q;j++){
                    c[i][j] = 0;
                    for(k=0;k<m;k++){
                        c[i][j] = c[i][j] + a[i][k] * b[k][j];
                    }
                }
            }

            for(i=0;i<n;i++){
                for(j=0;j<q;j++){
                    System.out.print(c[i][j]  + " ");
                }
                System.out.println("\n");
            }

        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
}


