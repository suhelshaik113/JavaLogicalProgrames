import java.util.*;
class Account{
  String acc_nam;
  long acc_num;
  double acc_bal;
  double de_acc;
  double w_bal;
  Scanner sc=new Scanner(System.in);
  void bank(){
    System.out.println("Enter your account name:");
    acc_nam=sc.next();
    System.out.println("Enter your account number:");
    acc_num=sc.nextLong();
    System.out.println("Enter your account balance:");
    acc_bal=sc.nextDouble();
  }
    
  void deposit(){
    System.out.println("---------------");
    System.out.println("Enter ur deposite balance:");
    de_acc=sc.nextDouble();
    acc_bal+=de_acc;
     
  }
  void withDraw(){
    System.out.println("Enter ur withdraw amount :");
    w_bal=sc.nextDouble();
    if(w_bal<acc_bal){
      System.out.println("you have withdraw amount of"+w_bal);
      acc_bal-=w_bal;
      System.out.println("you remaining  amount is"+acc_bal);
    }
    else{
      System.out.println("insufficient funds");
    }
  }
  void bankReport(){
    System.out.println("---------------");
    System.out.println("your name : " + acc_nam);
    System.out.println("your account num : " + acc_num);
    System.out.println("your diposite balance : " + de_acc);
    System.out.println("your total amount: " + acc_bal);
    System.out.println("your with draw amount : " + w_bal);
    System.out.println("your remaing amount : " + acc_bal);
   
  }
}

 


class bank_c20{
  public static void main(String args[]){
    Account b1=new Account();
    b1.bank();
    b1.deposit();
    b1.withDraw();
    b1.bankReport();
  }
}