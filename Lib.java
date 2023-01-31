import java.util.Scanner;
class Lib{
  public static void main(String args[]){
    String  day;
    double time;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter day of the week:");
    day=sc.next();
   /* System.out.println("Enter time(24 hours format) :");
    time=sc.nextDouble();*/
    if(day.equals("monday") ||day.equals("tuesday")||day.equals("wednesday") ||day.equals("thursay")||day.equals("saturday") || day.equals("sunday")){
      System.out.println("Enter time(24 hours format) :");
      time=sc.nextDouble();
      if(time>=7.00 && time<=19.00){
        System.out.println("The library is opened");
      }
      else{
        System.out.println("the library is not opened ");
      }
    }
    else{
      System.out.println("It's  holiday");
    }
    
  }
}