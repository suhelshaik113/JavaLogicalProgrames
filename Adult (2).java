import java.util.*;
class age{
  void child()
    {
    System.out.println("He is child");
    }
  void teen()
    {
    System.out.println("He is teen");
    }
  void adult()
    {
    System.out.println("He is aduly");
    }
}
class Adult{
  public static void main(String args[])
  {
    age a1 = new age();
    Scanner sc = new Scanner (System.in);
    int a ;
    if (age>=0 && age<13){ 
    a1.child();
    }
    else if(age>=13 && age<19){
    a1.teen();
    }
    else (age>=19){
    a1.adult();
    }
  }
}