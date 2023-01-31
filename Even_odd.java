import java.util.Scanner;
class Even_odd{
  public static void main (String args[])
  {
    int a;
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter Number value : ");
    a = sc.nextInt();
    
     switch (a%2)
    {
      case 0:
       System.out.println("It is Even Number");
        break;
    
    case 1 :
      System.out.println("It is Odd Number");
     break;
    }
  }
}