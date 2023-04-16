//Write a JAVAprogram to print all natural numbers from 1 to n. - using while loop //

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int i = 1;
        System.out.println("Natural numbers from 1 to " + n + ":");
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
    }
}