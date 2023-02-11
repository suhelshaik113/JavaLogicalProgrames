/**************************
Write a JAVAprogram to find last occurrence of a character in a given string.
***************************/

import java.util.Scanner;
class stralloccurances{
  public static void main(String args[]){
  
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter your String :");
    String s=sc.nextLine();
    System.out.println("enter your charcater :");
    char c=sc.next().charAt(0);
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)==c){
      System.out.println("your  last occurance of "+c+ " at "+i+ " position");
        
        }
    }
  }
}