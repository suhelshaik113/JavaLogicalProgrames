import java.util.Scanner;
class reverse_2{
  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter your string :");
    
    String st1 =sc.nextLine();
    String rev="";
    for (int i = st1.length()-1;i>=0;i--){
      rev =rev + st1.charAt(i);
    }
    
    System.out.println("Your reverse of String is : "+rev);
  }
}