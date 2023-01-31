import java.util.Scanner;
class circle2
{
  double area;
  void add(int r)
  {
  
  area = 3.14 * r * r;
  
    System.out.println("The Addition value is : " + area);
  }
}

class circle
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner(System.in);
    int r;
    
    
   System.out.println("Enter radius value : ");
    r = sc.nextInt();
    circle2  a1 = new circle2 ();
    a1.add(r);
  }
}