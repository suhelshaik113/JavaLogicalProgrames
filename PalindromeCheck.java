//  Write a JAVAprogram to check whether a string is palindrome or not  //

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "level";
        boolean isPalindrome = true;
        
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
