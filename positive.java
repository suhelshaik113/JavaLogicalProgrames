import java.util.Scanner;
class positive{
  public static void main (String args[])
  {
    int a;
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter Number value : ");
    a = sc.nextInt();
    
    if ( a >= 0)
    {
     System.out.println("It is Positive Number"); 
    }
    else{
      System.out.println("It is Negitive Number");
    }
  }
}