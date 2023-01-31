import java.util.Scanner;
class Adult{
  public static void main (String args[])
  {
    int age;
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter Age value : ");
    age = sc.nextInt();
    
    
    if (age>=0 && age<13)
    {
     System.out.println("He is a child");}
    else if (age>=13 && age<19)
    {System.out.println("He is a Teen");}
    else if (age>=19)
    {System.out.println("He is Adult");} 
    
  }
}