/*Create a program that converts Fahrenheit to Celsius using the formula (C = (F - 32) * 5/9)with using
with arguments and without return type
with arguments and with return type.*/
import java.util.*;
class Temp_1{
 double  c,c1;
  void temp1(double f){
   
    c=((double)(f-32)*5/9);
    System.out.println(" your temparature in celsius is :"+c);
  }
  double temp2(double f){
   
    c1=((double)(f-32)*5/9);
   return c1;
  }
  
}


class Temp{
  public static void main(String args[]){
     double c,f;
    Scanner sc=new Scanner(System.in);
     System.out.println("enter your temperature in fahrenheit:");
    f=sc.nextDouble();
    Temp t1=new Temp();
    t1.temp1(f);
    c=t1.temp2(f);
     System.out.println(" Your temparature in celsius is :"+c);
    
  }
}