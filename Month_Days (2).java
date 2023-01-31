// Claculate number of days , when the user enter name of the month.

import java.util.Scanner;

class month{
     void days()
  {
    
  }
  
}

class Month_days{
    public static void main(String args[])
  {
   month a1 = new month ();
    {
    String mon;
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter Name of the month : ");
    mon = sc.next();
    switch (mon) 
      {
        case "jan": case  "Mar" : case  "may" :case "july":case  "aug" :case  "oct":case "dec":
          System.out.println("It consist of 31 days");
          break;
          case "feb":
          System.out.println("It consist of 28 days");
          break;
          case "april":case"sep":case"nov":
          System.out.println("It consist of 30 days");
          break;
          default:
          System.out.println("It's Invalid input");
            
      }
   a1.days();
  }
}
}