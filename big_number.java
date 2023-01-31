import java.util.Scanner;
class big_number{
  public static void main(String args[])
  {
    int a,b,c;
    Scanner sc = new Scanner (System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    if (a>=b)
    {System.out.println("b is Big");}
    if (b>=c)
    {System.out.println("A is Big");}
    if (b>a)
    {System.out.println("b is Big");}
    if (b>c)
    {System.out.println("b is Big");}
    if (c>a)
    {System.out.println("c is Big");}
    if (c>b)
    {System.out.println("c is Big");}
  }
}