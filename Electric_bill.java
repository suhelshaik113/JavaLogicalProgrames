import java.util.Scanner;
class Electric{
  
  void bill_1(double Totalbill)
  {
     //double Totalbill;
     System.out.println("Your bill amount : " + Totalbill );
  }
  void bill_2(double Totalbill)
  {
     //double Totalbill;
     System.out.println("Your bill amount: " + Totalbill );
  }
  void bill_3(double Totalbill)
  {
     //double Totalbill;
     System.out.println("Your bill amount: " + Totalbill );
  }
   void bill_4(double Totalbill)
  {
     //double Totalbill;
     System.out.println("Your bill amount: " + Totalbill );
  }
}
class Electric_bill{
  public static void main (String agrs[])
  {
    Electric b1 = new Electric();
    Scanner sc = new Scanner (System.in);
    String cname;
    int cno,pred,lastred,totred;
    double Totalbill;
    System.out.println("Enter Counsumer name   : ");
    cname = sc.next();
    System.out.println("Enter Counsumer number : ");
    cno = sc.nextInt();
    System.out.println("Enter Presenting Reading : ");
    pred = sc.nextInt();
    System.out.println("Enter Last  Reading : ");
    lastred = sc.nextInt();
    System.out.println("-----------------------");
    totred = pred - lastred ;
    
    if (totred <= 50){
      
     double  bill = ((totred) * 0.50);
      double scharge = bill*20/(100);
     Totalbill = (bill + scharge);
      b1.bill_1(Totalbill);
    }
    else if (totred <= 150){
      double  bill = (50 * 0.50)+((totred-50)*0.75);
      double scharge = bill*20/(100);
     Totalbill = (bill + scharge);
      b1.bill_2(Totalbill);
    }
    else if (totred <= 250){
      double  bill = (50 * 0.50)+(50*0.75)+((totred-100)*0.75);
      double scharge = bill*20/(100);
     Totalbill = (bill + scharge);
      b1.bill_3(Totalbill);
    }
    else{
      double  bill = (50 * 0.50)+(50*0.75)+((150)*0.75)+((totred-250)*0.75);
      double scharge = bill*20/(100);
     Totalbill = (bill + scharge);
      b1.bill_4(Totalbill);
    
  }
}
}