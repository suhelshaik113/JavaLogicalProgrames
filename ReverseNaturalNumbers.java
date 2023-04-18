//. Write a JAVAprogram to print all natural numbers in reverse (from n to 1). - using while loop //

import java.util.Scanner;

public class ReverseNaturalNumbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int i = n;
        System.out.println("Natural numbers from 1 to " + n + ":");
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
    }
}