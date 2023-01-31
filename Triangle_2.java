/*Write a program to determine the type of a triangle based on its side lengths.*/
import java.util.Scanner;
class triAngle{
  int z;
  int typesOfTriangles(int side_1,int side_2,int side_3)
  {
   if (side_1 == side_2 && side_2 == side_3){
     return 0 ;
  }  
    else if (side_1 == side_2 || side_2 == side_3 || side_1 == side_3){
      return 1 ;
    }
    else{
      
      return 2;
    }
  }
}

class Triangle_2{
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
    
    int a = a1.typesOfTriangles(side_1,side_2,side_3);
    if (a==0){
      System.out.println("Its EQU Triangel");
    }
    else if (a==1){
      System.out.println("Its iso Triangel");
    }
    else {
    System.out.println("Its scal Triangel");}
      }
}