import java.util.Scanner;
class bigvalueof3num{
  public static void main (String args[])
  {
    int a,b,c;
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter A value : ");
    a = sc.nextInt();
    System.out.println("Enter B value : ");
    b = sc.nextInt();
    System.out.println("Enter C value : ");
    c = sc.nextInt();
    
    if (a>b && a>c)
    {
     System.out.println("a is bigger number" + a);}
    else if (b> a && b>c)
    {System.out.println("b is bigger number" + b);}
    else if (c> a && c>b)
    {System.out.println("c is bigger number" + c);} 
    
  }
}