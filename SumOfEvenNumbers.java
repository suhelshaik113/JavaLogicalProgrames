// . Write a JAVAprogram to find sum of all even numbers between 1 to n.//

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("The sum of all even numbers between 1 to " + n + " is: " + sum);
    }
}