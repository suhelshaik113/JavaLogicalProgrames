import java.util.Scanner;
class add
{
  int a,b,c ;
  void add ()
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a value : ");
  a = sc.nextInt(); 
  
  System.out.println("Enter b value : ");
  b = sc.nextInt(); 
    c = a+ b;
  
    System.out.println("The Addition value is : " + c);
  }
}

class Calculate 
{
  public static void main (String args[])
  {
    add a1 = new add ();
    a1.add();
  }
}