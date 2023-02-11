import java.util.Scanner;
class reverse_1{
  public static void main (String args[]){
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter Your String :");
    StringBuffer St1 = sc.nextLine();
    
    System.out.println("Your reverse of String is : "+St1.reverse());
  }
}