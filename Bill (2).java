import java.util.Scanner;
class bill
{
  void cost(int pno,String pname,float pcost,float pqty,float bamt)
  {
   System.out.println("The ProductNumber is : " + pno);
  System.out.println("The Product Name is : " + pname);
  System.out.println("The Product cost is : " + pcost);
  System.out.println("The Product Quantity is : " + pqty);
  System.out.println("The Amount is : " + bamt); 
  }
  
}

class Bill
{
  public static void main (String args[])
  {
    bill a1 = new bill();
    {
  int pno;
  String pname;
  Float pcost,pqty,bamt; 
  
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
      
  a1.cost(pno,pname,pcost,pqty,bamt);
  }
}
}