import java.util.Scanner;
class Mul_of_matrix{
  public static void main(String args[]){
    int row1,col1,row2,col2;
    Scanner s = new Scanner (System.in);
    System.out.println("Enter no.of rows in 1st matrix");
    row1=s.nextInt();
    System.out.println("Enter no.of col in 1st matrix");
    col1=s.nextInt();
    System.out.println("Enter no.of rows in 2nd matrix");
    row2=s.nextInt();
    System.out.println("Enter no.of rows in 2nd matrix");
    col2=s.nextInt();
    if (col1 != row2){
      System.out.println("Matrix mul not possible");
    }
    else {
      int a[][] = new int[row1][col1];
      int b[][] = new int[row2][col2];
      int c[][] = new int[row1][col2];
      System.out.println("Enter values of Matrix A :");
      for (int i=0;i<row1;i++){
        for(int j=0;j<col1;j++){
          a[i][j]=s.nextInt();
        }
      }
      System.out.println("Enter values of Matrix B :");
      for (int i=0;i<row2;i++){
        for(int j=0;j<col2;j++){
          b[i][j]=s.nextInt();
        }
      }
      System.out.println("Your Matrix Mul is :");
      for (int i=0;i<row1;i++){
        for(int j=0;j<col2;j++){
          c[i][j]=0;
          for(int k=0;k<col1;k++){
            c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
          }
          System.out.print(c[i][j]+"  ");
        }
        System.out.println();
      }
    }
  }
}