import java.util.Scanner;
class madam{
  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter your string :");
    String st1 =sc.nextLine();
    //String st2 = st1;
    String rev="";
    for (int i = st1.length()-1;i>=0;i--){
      rev =rev + st1.charAt(i);
    }
  
    if (st1.equalsIgnoreCase(rev)){
   System.out.println("Your String is palindrome : ");
  }
    else{
      System.out.println("Your String is not- palindrome string : ");}    
}
}
