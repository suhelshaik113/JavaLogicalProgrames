import java.util.Scanner;
class Student
{
  
  void marks (int sno,String sname, float hindi,float english,float telugu,float tot,float avg)
  {
  System.out.println("----------------------");
  System.out.println("The Student Number is : " + sno);
  System.out.println("The Student Name is : " + sname);
  System.out.println("Hindi marks is: " + hindi);
  System.out.println("english marks is: " + english);
  System.out.println("telugu marks is: " + telugu);
  System.out.println("Total marks is: " + tot);
  System.out.println("Total average is: " + avg);
  }
}

class Marks
{
  public static void main (String args[])
  {
  Student a1 = new Student ();
  int sno;
  String sname;
  Float hindi,english,telugu,tot,avg; 
  
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter Student Number is : ");
  sno = sc.nextInt();
  
  System.out.println("Enter Student Name is : ");
  sname = sc.next();
  
  System.out.println("Enter Hindi marks : ");
  hindi = sc.nextFloat();
  System.out.println("Enter English marks : ");
  english = sc.nextFloat();
  System.out.println("Enter Telugu marks : ");
  telugu = sc.nextFloat();
  
  tot = (hindi + english + telugu);
  avg = (float)tot/3;
  a1.marks(sno,sname,hindi,english,telugu,tot,avg);
  }
}