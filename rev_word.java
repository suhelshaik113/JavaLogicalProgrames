import java.util.Scanner;

class rev_word
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.println("Enter your String ");
	    String s = sc.nextLine();
	    String s2 = "";
	    
	    for (char ch = 'a';ch<='z';ch++){
	        for (int i = 0 ;i<s.length();i++){
	            if(ch == s.charAt(i)){
	                s2=s2+ch;
	            }
	        }
	    }
		System.out.println(s2);
	}
}