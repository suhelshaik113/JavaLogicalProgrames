import java.util.*;
class Temp{
  public static void main(String args[]){
    double temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your temperature(In celcius):");
    temp=sc.nextInt();
    if(temp>0){
      if(temp<=15){
        System.out.println("Its above freezing point");
      }
      else if(temp>16 && temp<=25){
        System.out.println("Its normal temperature");
      }
      else if(temp>=26 && temp<=99){
        System.out.println("Its below boiling point");
      }
      else{
        System.out.println("Its above boiling point");
      }
    }
    else{
      System.out.println("Its below freezing point");
    }
  }
}