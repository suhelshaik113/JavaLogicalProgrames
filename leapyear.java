import java.util.Scanner;
class leapyear{
  public static void main (String args[])
  {
    int a;
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter year : ");
    a = sc.nextInt();
    
    if ((a%4 == 0) && (a% 100 !=0) || (a % 400 == 0))
    {
     System.out.println("It is Leap Year"); 
    }
    else{
      System.out.println("It is Not-leap year");
    }
  }
}