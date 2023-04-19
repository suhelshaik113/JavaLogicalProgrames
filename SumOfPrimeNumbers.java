// Write a JAVAprogram to find sum of all prime numbers between 1 to n.  //

import java.util.Scanner;

public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
            }
        }
        System.out.println("Sum of prime numbers between 1 and " + n + " is: " + sum);
        
    }
}
