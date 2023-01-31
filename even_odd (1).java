import java.util.Scanner;
class even_odd{
  public static void main (String args[])
  {
    int a;
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter Number value : ");
    a = sc.nextInt();
    
    if (a%2 == 0)
    {
     System.out.println("It is Even Number"); 
    }
    else{
      System.out.println("It is Odd Number");
    }
  }
}