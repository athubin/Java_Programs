import java.io.*;

class MatrixRowColSum{
    public static void main(String args[]){
        int a[][], i,j,m,n,rs=0,cs=0;
        System.out.println("Matrix Row and Column Sum\n-------------------");
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the number of rows: ");
            m = Integer.parseInt(br.readLine());
            System.out.print("Enter the number of columns: ");
            n = Integer.parseInt(br.readLine());
            a = new int[m][n];
            System.out.println("Enter the matrix elements: ");
            for(i=0;i<m;i++){
                for(j=0;j<n;j++){
                    a[i][j] = Integer.parseInt(br.readLine());
                }
            }
            System.out.println();
            for(i=0;i<m;i++){
                for(j=0;j<n;j++){
                    System.out.print(a[i][j] + " ");
                    rs = rs + a[i][j];
                }
                System.out.print("| " + rs);
                rs = 0;
                System.out.println("\n");
            }
            for(i=0;i<n;i++){
                System.out.print("--");
            }
            System.out.println();
            for(i=0;i<n;i++){
                for(j=0;j<m;j++){
                    cs = cs + a[j][i];
                }
                System.out.print(cs + " ");
                cs = 0;
            }
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
}