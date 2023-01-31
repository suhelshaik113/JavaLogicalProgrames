import java.util.Scanner;
class add
{
  int sno;
  String sname;
  Float hindi; 
  Float english;
  Float telugu;
  Float tot;
  Float avg;
  void add1 ()
  {
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

  
  System.out.println("The Student Number is : " + sno);
  System.out.println("The Student Name is : " + sname);
  System.out.println("Hindi marks is: " + hindi);
  System.out.println("english marks is: " + english);
  System.out.println("telugu marks is: " + telugu);
  System.out.println("Total marks is: " + tot);
  System.out.println("Total average is: " + avg);
  }
}

class marks
{
  public static void main (String args[])
  {
    add a1 = new add ();
    a1.add1();
  }
}