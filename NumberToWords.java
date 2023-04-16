// Write a JAVAprogram to enter a number and print it in words //

import java.util.Scanner;

public class NumberToWords {
    private static final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        if (number == 0) {
            System.out.println("Zero");
            return;
        }
        String words = "";
        if (number < 0) {
            words += "minus ";
            number = -number;
        }
        if (number >= 10000000) {
            words += convert(number / 10000000) + " crore ";
            number %= 10000000;
        }
        if (number >= 100000) {
            words += convert(number / 100000) + " lakh ";
            number %= 100000;
        }
        if (number >= 1000) {
            words += convert(number / 1000) + " thousand ";
            number %= 1000;
        }
        if (number >= 100) {
            words += convert(number / 100) + " hundred ";
            number %= 100;
        }
        if (number >= 20) {
            words += tens[number / 10] + " ";
            number %= 10;
        }
        if (number > 0) {
            words += ones[number] + " ";
        }
        System.out.println(words.trim());
    }
    
    private static String convert(int number) {
        if (number == 0) {
            return "";
        } else if (number < 20) {
            return ones[number] + " ";
        } else if (number < 100) {
            return tens[number / 10] + " " + ones[number % 10] + " ";
        } else {
            return convert(number / 100) + "hundred " + convert(number % 100);
        }
    }
}