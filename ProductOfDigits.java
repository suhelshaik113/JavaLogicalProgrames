//Write a JAVAprogram to calculate product of digits of a number.//

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        int product = 1;
        while (number != 0) {
            int digit = number % 10;
            product *= digit;
            number /= 10;
        }
        System.out.println("The product of digits of the number is: " + product);
    }
}