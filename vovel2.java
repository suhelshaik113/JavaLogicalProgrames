import java.util.Scanner;
class vovel2{
  public static void main (String args[])
  {
    char ch;
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter vowel: ");
    ch = sc.next().charAt(0);
    
    
    if (ch=='a' || ch=='A')
    {
     System.out.println("Its a vowel");}
    else if (ch=='e' || ch=='E')
    {System.out.println("Its a vowel");}
    else if (ch=='i' || ch=='I')
    {System.out.println("Its a vowel");} 
    else if (ch=='o' || ch=='O')
    {System.out.println("Its a vowel");} 
    else if (ch=='u' || ch=='U')
    {System.out.println("Its a vowel");}
    else {
      System.out.println("Its a Consonant");
    }
    
  }
}