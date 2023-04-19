// .. Write a JAVAprogram to print all Strong numbers between 1 to n..//

import java.util.Scanner;

public class StrongNumbersInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int n = input.nextInt();

        System.out.println("Strong numbers between 1 and " + n + " are: ");

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int temp = i;

            while (temp > 0) {
                int digit = temp % 10;
                sum += factorial(digit);
                temp /= 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}