import java.util.Scanner;
class weekday{
  public static void main (String args[])
  {
    int a;
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter day value : ");
    a = sc.nextInt();
    
    
    if (a==0)
    {
     System.out.println("Its Monday");}
    else if (a==1)
    {System.out.println("Its Tuesday");}
   else if (a==2)
    {System.out.println("Its wednesday");}
    else if (a==3)
    {System.out.println("Its Thursday");}
    else if (a==4)
    {System.out.println("Its friday");}
    else if (a==5)
    {System.out.println("Its saturday");}
    else if (a==6)
    {System.out.println("Its sunday");}
    else
    {System.out.println("Its Invalid Input");}
  }
}