import java.util.Scanner;
class vote{
  public static void main (String args[])
  {
    int a;
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter age value : ");
    a = sc.nextInt();
    
    if (a>=18)
    {
     System.out.println("He/She eligible for vote"); 
    }
    else{
      System.out.println("He/she Not-eligible for vote");
    }
  }
}