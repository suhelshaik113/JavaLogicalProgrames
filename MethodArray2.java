import java.util.Scanner;
class methodarray3{
  int n,i;
  void array(int a[])
  {
    Scanner sc = new Scanner(System.in);
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
class MethodArray2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n,i;
    System.out.println("Enter your array size :");
    n=sc.nextInt();
    int a[] = new int[n];
    methodarray3 a1 = new methodarray3();
    a1.array(a);
    
  }
}