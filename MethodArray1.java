import java.util.Scanner;
class methodarray2{
  int n,i;
  void array()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your array size :");
    n=sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter your array Elements :");
    for (i=0;i<a.length;i++){
      a[i] = sc.nextInt(); 
    }
     System.out.println("Your Elements in array :");
    for (i=0;i<a.length;i++){
      
      System.out.println("  "+a[i]);
    }
  }
  
}
class MethodArray1{
  public static void main(String args[]){
    
    methodarray2 a1 = new methodarray2();
    a1.array();
    
  }
}