// First java program
import java.util.Scanner;
// import java.lang.*;
class temp{
public static void main (String args[])
{
double temp;
double c;

  Scanner sc = new Scanner (System.in);
  System.out.println("Enter temperature in Fahrenheit: ");
  temp = sc.nextDouble();
  

  c = ((double)(temp - 32) * 5/9);
  
System.out.println("The temperature in Celsius is : " + c);
 
}
}