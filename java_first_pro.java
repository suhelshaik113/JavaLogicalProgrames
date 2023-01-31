// First java program
import java.util.Scanner;

// import java.lang.*;
class java_first_pro{
public static void main (String args[])
{
int a,b;
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter Integer value1 : ");
  a = sc.nextInt();
  System.out.println("Enter Integer value2 : ");
  b = sc.nextInt();

   System.out.println("Enter given Integer value is : " + a);
   System.out.println("Enter given Integer value is : " + b);
  
   System.out.println ("The Addition of " + a + " and " + b + "  is " + (a+b));
}
}