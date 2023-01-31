import java.util.*;
public class Bank
{
	public static void main(String[] args) {
		String cname;
		long acc_num;
		String opr;
		double acc_bal = 5000;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		cname=sc.next();
		System.out.println("enter account number");
		acc_num=sc.nextLong();
		System.out.println("choose your option (W/D/B)");
		opr=sc.next();
		
		
	    if (opr.equals("W")){
	        System.out.println("Enter Your Withdraw Balance");
	        double wb = sc.nextDouble();
		    if (wb<=acc_bal){
		       System.out.println("Amount has been withdraw " + wb);
		       acc_bal -= wb ;
		       System.out.println("Your Balance is:" + acc_bal);
		    }
		    else{
		        System.out.println("In sufficent funds");
		    }
	    }
		    else if (opr.equals("D")){
		        System.out.println("Enter Your Deposit Balance");
	            double db = sc.nextDouble();
	            acc_bal += db;
	            System.out.println("Your Balance is:" + acc_bal);
		    }
		    else {
		    System.out.println("Your Account Balance is:" + acc_bal);
		    }
	}
}
