// Write a JAVAprogram to find frequency of each digit in a given integer.//

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int[] frequency = new int[10];
        while (number != 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Frequency of digit " + i + " is " + frequency[i]);
            }
        }
    }
}
