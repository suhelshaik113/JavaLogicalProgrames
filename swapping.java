// First java program
import java.util.Scanner;

// import java.lang.*;
class swapping{
public static void main (String args[])
{
 
  
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter first number as a: ");
  int a = sc.nextInt();
  System.out.println("Enter Second number as b: ");
  int b = sc.nextInt();
  System.out.println("Before Swapping");
  System.out.println(a);
  System.out.println(b);
  a = a+ b ;
  b = a - b ;
  a = a - b ;
  System.out.println("After Swapping");
  System.out.println(a);
  System.out.println(b);
}
}