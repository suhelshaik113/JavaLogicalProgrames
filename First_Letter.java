// First java program
import java.util.Scanner;

// import java.lang.*;
class First_Letter{
public static void main (String args[])
{
 char ch;
  
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter any char  value : ");
  ch = sc.next().charAt(0);
  System.out.println("The given char is : " + ch);
}
}