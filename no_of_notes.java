import java.util.Scanner;
public class no_of_notes
{
	public static void main(String[] args) {
	   
	    int amt,a500,a200,a100,a50,a20,a10;
	    Scanner sc = new Scanner (System.in);
		System.out.println("Enter Your Amount :");
	    amt = sc.nextInt();
		a500 = amt/500;
		amt = amt%500;
		a200 = amt/200;
		amt = amt%200;
		a100 = amt/100;
		amt = amt % 100;
		a50 = amt/50;
		amt = amt % 50;
		a20 = amt/20;
		amt = amt %20;
		a10 = amt/10;
		amt = amt %10;
		System.out.println("no.of 5oo rupees notes : " + a500);
		System.out.println("no.of 2oo rupees notes : " + a200);
		System.out.println("no.of 1oo rupees notes : " + a100);
		System.out.println("no.of 5o rupees  notes  : " +   a50);
		System.out.println("no.of 2o rupees  notes  : " +   a20);
		System.out.println("no.of 1o rupees  notes  : " +   a10);
    System.out.println("---------------------------------");
    System.out.println("Your total number of notes = " + (a500+a200+a100+a50+a20+a10));
	}
	}
