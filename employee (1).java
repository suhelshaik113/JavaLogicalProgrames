import java.util.Scanner;
class bill
{
  int ID;
  Float SAL;
  String NAME ;
  void cost()
  {
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

class employee
{
  public static void main (String args[])
  {
    bill a1 = new bill();
    a1.cost();
  }
}