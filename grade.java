
import java.util.Scanner;

class grade{
public static void main (String args[])
{

int hindi; 
int english;
int telugu;
int tot;
Float avg;
  
  Scanner sc = new Scanner (System.in);

  
  System.out.println("Enter Hindi marks : ");
  hindi = sc.nextInt();
  System.out.println("Enter English marks : ");
  english = sc.nextInt();
  System.out.println("Enter Telugu marks : ");
  telugu = sc.nextInt();
  
  

  if (hindi>=40 && english>=40 && telugu >=40)
    {
      tot = (hindi + english + telugu);
      avg = (float)tot/3;
     System.out.println("He is a pass");
    if (avg<=50)
    {System.out.println("He/she Grade C");}
    else if (avg>=51 && avg<=70)
    {System.out.println("He/she Grade B");} 
    else if (avg>=51 && avg<=80)
    {System.out.println("He/she Grade A");} 
    else if (avg>=80)
    {System.out.println("Student Pass in Distension");} 
    }
  else{
    System.out.println("He is a fail");
  }
  
}
}