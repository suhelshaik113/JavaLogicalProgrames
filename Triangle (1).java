/*Write a program to determine the type of a triangle based on its side lengths.*/
import java.util.Scanner;
class triAngle{
  String s;
  String typesOfTriangles(int side_1,int side_2,int side_3)
  {
    if (side_1 == side_2 && side_2 == side_3){
      s= ("Its Equilateral triangle");
    }
    else if (side_1 == side_2 || side_2 == side_3 || side_1 == side_3){
      s= ("Its Isosceles triangle");
    }
    else{
      s = ("Its Scalene Triangel");
    }
    return (s);
  }
  
}
class Triangle{
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    int side_1,side_2,side_3;
    triAngle a1 = new triAngle();
    System.out.println("Enter your  side_1 : ");
    side_1 = sc.nextInt();
    System.out.println("Enter your  side_2 : ");
    side_2 = sc.nextInt();
    System.out.println("Enter your side_3  : ");
    side_3 = sc.nextInt();
    String s ;
    s = a1.typesOfTriangles(side_1,side_2,side_3);
    System.out.println(s);
      }
  }

