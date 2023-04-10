//  Write a JAVAprogram to check whether a number is Armstrong number or not.  //

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int temp = num;
        int sum = 0;
        int power = String.valueOf(num).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, power);
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}