// . Write a JAVAprogram to print all Perfect numbers between 1 to n.  //

import java.util.Scanner;

public class PerfectNumbersInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int n = input.nextInt();

        System.out.println("Perfect numbers between 1 and " + n + " are: ");

        for (int i = 1; i <= n; i++) {
            int sum = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
