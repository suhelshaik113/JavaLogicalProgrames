import java.util.Scanner;
public class int_char_special
{
	public static void main(String[] args) {
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your digit/charcater/special charcater :");
    ch=sc.next().charAt(0);
    if(ch>='0' && ch<='9' ){
           System.out.println("it is  digit");
       }
     else if(ch>='A' && ch<='Z'|| ch>='a' && ch<='z'){
         System.out.println("it is  character");
     }
     else{
         System.out.println("it is  special character");
     }
    
	}	
}