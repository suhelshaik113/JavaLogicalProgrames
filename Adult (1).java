import java.util.Scanner;
class age {
  Scanner sc = new Scanner (System.in);
  int age;
  System.out.println("Enter your age : ");
  age = sc.next();
  void child()
  {
    if (age=>0 && age<13){
      System.out.println("He is child");
    }
    
  }
  void teen()
  {
    if (age=>13 && age<19){
      System.out.println("He is teen"); 
  }
  void adult()
  {
    if (age>=19){
      System.out.println("He is adult");
  }
}
class Adult{
  public static void main(String agrs[])
  {
    age a1 = new age();
    a1.child();
    a1.teen();
    a1.adult();
    
  }
}