import java.util.Scanner;
class Month_days{
  public static void main (String args[])
  {
    int month;
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter Month Number : ");
    month = sc.nextInt();
     switch (month)
    {
     case 1: case 3: case 5: case 7:case 8:case 10:case 12:
     System.out.println("This month have 31 Days");
     break;
     case 4: case 9: case 6: case 11:
     System.out.println("This month have 30 Days");
     break;
     case 2:
     System.out.println("This month have 28 Days");
     break;
     
    default :
    System.out.println("Its invalid input");
    
  }
}
}