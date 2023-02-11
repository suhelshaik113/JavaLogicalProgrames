import java.util.Scanner;
class equals{
  public static void main(String args[]){
  
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter your String 1 :");
    String st1=sc.nextLine();
    //String St1=n;
    System.out.println("Enter your String 2 :");
    String st2=sc.nextLine();
    
    if (st1.equals(st2)){
      System.out.println("Both are Equal");
    }
    else{
      System.out.println("Both are not-Equal");
    }
  }
}
