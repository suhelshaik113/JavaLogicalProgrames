import java.util.Scanner;
class sumofmatrix{
    public static void main (String args[]){
        int m,n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row and col size");
        m = s.nextInt();
        n = s.nextInt();
        int a[][] = new int [m][n];
        int b[][] = new int [m][n];
        int c[][] = new int [m][n];
        System.out.println("Enter values of first matrix ");
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter values of Second matrix ");
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                b[i][j]=s.nextInt();
            }
        }
        //calculation part
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Matrix A ");
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+"  ");
            }
           System.out.println(); 
        }
        System.out.println("Matrix B ");
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(b[i][j]+"  ");
            }
           System.out.println(); 
        }
        System.out.println("Sum of your Matrix");
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("  "+c[i][j]+"  ");
            }
           System.out.println(); 
        }
    }
}