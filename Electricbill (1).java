// First java program
import java.util.Scanner;
// import java.lang.*;
class Electricbill{
public static void main (String args[])
{
int cno;
String cname;
Float presentmonthreading; 
Float lastmonthreading;
Float units;
Double bill;

  
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter Counsumer Number is : ");
  cno = sc.nextInt();
  
  System.out.println("Enter Counsumer Name is : ");
  cname = sc.next();
  
  System.out.println("Enter present month reading is: ");
  presentmonthreading = sc.nextFloat();
  System.out.println("last month reading is : ");
  lastmonthreading = sc.nextFloat();
units = (presentmonthreading - lastmonthreading );
bill = (double)units*3.80;
  
  

  
  System.out.println("The COUNSUMER Number is : " + cno);
  System.out.println("The COUNSUMER Name is : " + cname);
  System.out.println("present month reading is: " + presentmonthreading);
  System.out.println("last month reading is: " + lastmonthreading );
  System.out.println("Total units : " + units);
  System.out.println("Total bill is: " + bill);
  
}
}