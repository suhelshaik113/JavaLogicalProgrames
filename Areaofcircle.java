
// First java program
import java.util.Scanner;

// import java.lang.*;
class Areaofcircle{
public static void main (String args[])
{
int r;
Float pi = 3.14f;
Float area;
 
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter Radius value : ");
  r = sc.nextInt();

  area = pi * r * r;
  System.out.println("The area of the circle is : " + area);

}
}