import java.util.Scanner;
class break_vowel{
  public static void main (String args[])
  {
    char ch;
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter Letter : ");
    ch = sc.next().charAt(0);
    
    
    switch (ch)
    {
     case 'a':case 'A':
     case 'e':case 'E':
     case 'i':case 'I':
     case 'o':case 'O':
     case 'u':case 'U':
     System.out.println("Its Vowel");
     break;
    default :
    System.out.println("Its Consonent");
  }
}
}