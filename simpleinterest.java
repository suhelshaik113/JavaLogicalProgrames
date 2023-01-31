// First java program
import java.util.Scanner;
// import java.lang.*;
class simpleinterest{
public static void main (String args[])
{
Float p;
Float t; 
Float r;
Float SI;
Float Total;
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter principal value : ");
  p = sc.nextFloat();
  System.out.println("Enter time value : ");
  t = sc.nextFloat();
  System.out.println("Enter rate value : ");
  r = sc.nextFloat();

  SI = ((p * t * r) /100 );
  Total = SI + p;
  System.out.println("The simple interest is : " + SI);
 System.out.println("The TOTAL amount is : " + Total);
}
}