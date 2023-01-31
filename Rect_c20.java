/*Create a class that represents a rectangle, including the width and height. Write methods to calculate the area and perimeter of the rectangle.*/
import java.util.Scanner;
class Rect{
  
  float area;
  float peri;
  
  void area(int l , int b ){
    
    area = l * b ;
    System.out.println("The area of the Rect : " + area);
  }
  void perimeter(int l, int b){
    
    peri= 2*(l * b);
    System.out.println("The perimeter of the Rect : " + peri);
  }
  
}
class Rect_c20{
  public static void main(String args[])
  {
    Scanner sc =new  Scanner (System.in);
    int l,b;
    System.out.println("Enter your length");
		l=sc.nextInt();
    System.out.println("Enter your width");
		b=sc.nextInt();
  
    Rect b1=new Rect();
    
    b1.area(l,b);
    b1.perimeter(l,b);
  }
}