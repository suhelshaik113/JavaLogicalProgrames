import java.util.Scanner;
class break_1{
  public static void main (String args[])
  {
    int a;
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter day value : ");
    a = sc.nextInt();
    
    
    switch (a)
    {
     case 1:
     System.out.println("Its Monday");
     break;
     case 2 :
     System.out.println("Its Tuesday");
     break;
    case 3:
    System.out.println("Its wednesday");
    break;
    case 4:
    System.out.println("Its Thursday");
    break;
    case 5:
    System.out.println("Its friday");
    break;
    case 6:
    System.out.println("Its saturday");
    break;
    case 7:
    System.out.println("Its sunday");
    break;
    default :
    System.out.println("Its Invalid Input");
  }
}
}