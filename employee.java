// First java program
import java.util.Scanner;

// import java.lang.*;
class employee{
public static void main (String args[])
{
int ID;
Float SAL;
String NAME ;
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter Employee Id  : ");
  ID = sc.nextInt();
  System.out.println("Enter Employee Name : ");
  NAME = sc.next();
  System.out.println("Enter Employee Salary : ");
  SAL = sc.nextFloat();

   System.out.println("Given Employee id is : " + ID);
   System.out.println("Given Employee Salary is : " + SAL);
   System.out.println("The given string is : " + NAME);
  
}
}