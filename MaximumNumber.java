//Write a JAVAprogram to find maximum between three numbers//

import java.util.Scanner;

public class MaximumNumber {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the first number: ");
      int num1 = sc.nextInt();

      System.out.print("Enter the second number: ");
      int num2 = sc.nextInt();

      System.out.print("Enter the third number: ");
      int num3 = sc.nextInt();

      int max = num1;

      if(num2 > max) {
         max = num2;
      }

      if(num3 > max) {
         max = num3;
      }

      System.out.println("The maximum number is: " + max);
   }
}
