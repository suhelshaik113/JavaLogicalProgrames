import java.util.Scanner;
class simple
{
  Float p,t,r,SI,Total;
  
  void Interest()
  {
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

class simpleinterest
{
  public static void main (String args[])
  {
    simple a1 = new simple();
    a1.Interest();
  }
}