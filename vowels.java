import java.util.Scanner;
class vowels{
  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter your Nmae");
    String st1 = sc.nextLine();
    int vowels = 0;
    int consonents = 0;
    for (int i=0;i<st1.length();i++){
     char ch = st1.charAt(i);
      if (ch == 'a'|| ch == 'e'||ch == 'i'|| ch == 'o'||ch =='u')
      {
       vowels++;
     }
      else{
        consonents++;
      }
    }
    System.out.println("Vowels in the String : "+vowels);
    System.out.println("Consonents in the String : "+consonents);
  }
}