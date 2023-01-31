
import java.util.Scanner;
// import java.lang.*;
class Areaofrect{
public static void main (String args[])
{
Float l;
Float w; 
Float area;
Float circum;
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter Length value : ");
  l = sc.nextFloat();
  System.out.println("Enter width value : ");
  w = sc.nextFloat();

  area = (w * l);
  circum = 2 *(l+w);
  System.out.println("The area of the rect is : " + area);
 System.out.println("The circumference of the rect is : " + circum);
}
}