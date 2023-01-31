// First java program
import java.util.Scanner;
// import java.lang.*;
class Electricbill{
public static void main (String args[])
{
int cno;
String cname;
Float presentmonthreading; 
Float lastmonthreading;
Float units;
Double bill;

  
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter Counsumer Number is : ");
  cno = sc.nextInt();
  
  System.out.println("Enter Counsumer Name is : ");
  cname = sc.next();
  
  System.out.println("Enter present month reading is: ");
  presentmonthreading = sc.nextFloat();
  System.out.println("last month reading is : ");
  lastmonthreading = sc.nextFloat();
units = (presentmonthreading - lastmonthreading );

  
  
System.out.println("-----------");
  
  System.out.println("The COUNSUMER Number is : " + cno);
  System.out.println("The COUNSUMER Name is : " + cname);
  System.out.println("present month reading is: " + presentmonthreading);
  System.out.println("last month reading is: " + lastmonthreading );
  System.out.println("Total units : " + units);
  System.out.println("-----------");
  //System.out.println("Total bill is: " + bill);
   if(units<=50){
        bill=units*1.45;
     System.out.println("Your bill amount is:" + bill);}
      else if(units<=100){
        bill=(50*1.45)+((units-50)*2.56);
      System.out.println("Your bill amount is:" + bill);}
      else if (units<=200){
        bill=(50*1.45)+(50*2.56)+((units-100)*3.50);
        System.out.println("Your bill amount is:" + bill);}
      else if (units<=300){
        bill=(50*1.45)+(50*2.56)+((100)*3.50) + ((units-200)*4.67);
        System.out.println("Your bill amount is:" + bill);}
     else{
       bill = (50*1.45)+(50*2.56)+(100*3.50) + (200*4.67)+((units-300)*5.6);
     System.out.println("Your bill amount is:" + bill);}
}
}
