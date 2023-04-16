//  Write a JAVAprogram to print Fibonacci series up to n terms.  //

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci series up to " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}