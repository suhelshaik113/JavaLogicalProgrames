//Write a JAVAprogram to find sum of all odd numbers between 1 to n.//

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("The sum of all odd numbers between 1 to " + n + " is: " + sum);
    }
}
