import java.util.Scanner;
class ovel{
  public static void main (String args[])
  {
    char ch;
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter vowel : ");
    ch = sc.next().charAt(0);
    
    if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' ||ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' ||ch == 'u' || ch == 'U')
    {
     System.out.println("Given is VOWEL"); 
    }
    else{
      System.out.println("Given is not-VOWEL");
    }
  }
}