import java.util.Scanner;
class Rain_Sum_Win{
  public static void main (String args[])
  {
    int a;
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter Month  : ");
    a = sc.nextInt();
    
    
    switch (a)
    {
     case 3: case 4: case 5: case 6:
     System.out.println("Its summer season");
     break;
     case 7: case 8: case 9: case 10:
     System.out.println("Its Rain Season");
     break;
     case 11: case 12: case 1: case 2:
     System.out.println("Its winter Season");
     break;
     
    default :
    System.out.println("Its invalid input");
  }
}
}