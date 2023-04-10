//   WAP to Display the ATM Transaction  //

import java.util.Scanner;

public class ATMTransaction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 5000;

        System.out.println("Welcome to the ATM!");
        System.out.println("Your current balance is: " + balance);

        while (true) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");

            int option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the amount you want to withdraw:");
                    int withdrawAmount = input.nextInt();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Transaction successful!");
                    }
                    break;

                case 2:
                    System.out.println("Enter the amount you want to deposit:");
                    int depositAmount = input.nextInt();
                    balance += depositAmount;
                    System.out.println("Transaction successful!");
                    break;

                case 3:
                    System.out.println("Your current balance is: " + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }
}