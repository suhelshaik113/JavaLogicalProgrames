import java.io.*;
class student{
public static void main (String args[]) throws IOException
{
int sno;
String sname;
Float hindi,english,telugu,tot,avg; 

InputStreamReader in=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(in);
  System.out.println("Enter Student Number is : ");
  sno =Integer.parseInt(br.readLine());
  
  System.out.println("Enter Student Name is : ");
  sname = br.readLine();
  
  System.out.println("Enter Hindi marks : ");
  hindi = Float.parseFloat(br.readLine());
  System.out.println("Enter English marks : ");
  english = Float.parseFloat(br.readLine());
  System.out.println("Enter Telugu marks : ");
  telugu = Float.parseFloat(br.readLine());
  
  tot = (hindi + english + telugu);
  avg = (float)tot/3;

  System.out.println("********************");
  System.out.println("The Student Number is : " + sno);
  System.out.println("The Student Name is : " + sname);
  System.out.println("Hindi marks is: " + hindi);
  System.out.println("english marks is: " + english);
  System.out.println("telugu marks is: " + telugu);
  System.out.println("Total marks is: " + tot);
  System.out.println("Total average is: " + avg);
}
}