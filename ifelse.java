import java.util.Scanner;
class ifelse{
  public static void main (String args[])
  {
    int a;
    int b;
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a value : ");
    a = sc.nextInt();
    System.out.println("Enter b value : ");
    b = sc.nextInt();
    if (a>b)
    {
     System.out.println("a is big"); 
    }
    else{
      System.out.println("b is big");
    }
  }
}