import java.util.Scanner;
class grade_2{
  public static void main(String args[])
  {
    float grade;
    Scanner sc = new Scanner (System.in);
     System.out.println("Enter Your Grade");
    if (grade >=7.0)
    {
      System.out.println("Your Grade A");
    }
    else if (grade <=7.1 && grade < 6.0);
    {
      System.out.println("Your Grade B");
    }
    else 
    {
      System.out.println("Your Grade C");
    }
  }
}