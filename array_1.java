import java.util.Scanner;
class array_1{
public static void main(String args[])
{
  int i,n;
  int sum = 0;
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter no of Array Elements ");
  n = sc.nextInt();
  int a[] = new int [n];
  System.out.println("Enter Elements of Array");
  for (i=0;i<n;i++)
    {
      a[i] = sc.nextInt();
    }
  System.out.println("The Elements in Array is :");
  for(i = 0;i<n;i++){
    System.out.println(a[i]);
    sum = sum + a[i];
  }
  System.out.println("Your For Each loop");
  for (int b : a){
    
    System.out.println(b);
  }
  System.out.print("Your sum of array is =" + sum);
}
}