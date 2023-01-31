import java.util.Scanner;
public class divisible_5_55
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
		System.out.println("Enter Your Number");
		int Num =sc.nextInt();
	    
	    if ((Num % 5 == 0) && (Num % 11 == 0))
	    {
	        System.out.println("It's Divisible by 5 and 11");
	    }
	    else 
	    {
	        System.out.println("It's Not-Divisible by 5 and 11");
	    }
	}
}
