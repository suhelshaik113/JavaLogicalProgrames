// First java program
import java.util.Scanner;
// import java.lang.*;
class Bill{
public static void main (String args[])
{
int pno;
String pname;
Float pcost; 
Float pqty;
Float bamt;

  Scanner sc = new Scanner (System.in);
  System.out.println("Enter ProductNumber value : ");
  pno = sc.nextInt();
  
  System.out.println("Enter Product Name is : ");
  pname = sc.next();
  
  System.out.println("Enter Product cost is : ");
  pcost = sc.nextFloat();
  
  System.out.println("Enter Product Quantity is : ");
  pqty = sc.nextFloat();

  bamt = pqty * pcost ; 
  System.out.println("The ProductNumber is : " + pno);
  System.out.println("The Product Name is : " + pname);
  System.out.println("The Product cost is : " + pcost);
  System.out.println("The Product Quantity is : " + pqty);
  System.out.println("The Amount is : " + bamt);
 
}
}