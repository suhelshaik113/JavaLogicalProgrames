//. Write a JAVAprogram to find sum of first and last digit of a number.//

import java.util.Scanner;

public class SumFirstLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int firstDigit = num, lastDigit = num % 10;
        while(firstDigit >= 10) {
            firstDigit /= 10;
        }
        int sum = firstDigit + lastDigit;
        System.out.println("Sum of first and last digit: " + sum);
    }
}
