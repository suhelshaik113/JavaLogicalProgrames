/**************************
Write a JAVAprogram to count occurrences of a character in given string.
***************************/
import java.util.Scanner;
class Strcountoccurances{
  public static void main(String args[]){
  
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter your String :");
    String s=sc.nextLine();
    System.out.println("enter your charcater :");
    char c=sc.next().charAt(0);
    int k=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)==c){
            
        k++;
        }
    }
    System.out.println("your  count  occurance of "+c+ " is "+k);
  }
}