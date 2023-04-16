//Write a JAVAprogram to find first and last digit of a number..//

import java.util.Scanner;

public class FirstLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int firstDigit = num, lastDigit = num % 10;
        while(firstDigit >= 10) {
            firstDigit /= 10;
        }
        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
    }
}