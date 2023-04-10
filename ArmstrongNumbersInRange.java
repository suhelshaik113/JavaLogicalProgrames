// Write a JAVAprogram to print all Armstrong numbers between 1 to n.  //

import java.util.Scanner;

public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int n = input.nextInt();

        System.out.println("Armstrong numbers between 1 and " + n + " are: ");

        for (int i = 1; i <= n; i++) {
            int temp = i;
            int sum = 0;
            int power = String.valueOf(i).length();

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, power);
                temp /= 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
