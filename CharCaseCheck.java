//Write a JAVAprogram to check whether a character is uppercase or lowercase alphabet//

import java.util.Scanner;

public class CharCaseCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase alphabet");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase alphabet");
        } else {
            System.out.println(ch + " is not an alphabet");
        }
    }
}