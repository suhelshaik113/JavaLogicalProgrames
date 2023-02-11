import java.util.Scanner;
class substring{
  public static void main(String args[]){
  
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter your String :");
    String n=sc.nextLine();
    String St1=n;
    System.out.println("Enter your index:");
    int i = sc.nextInt();
    System.out.println("The char given position is:" + n.substring(i));
    
  }
}
