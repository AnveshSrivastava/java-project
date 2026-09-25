package Week1;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0.0;
        boolean running = true;
        System.out.println("--- Welcome to the Bank Management System ---");
        while (running) {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit Application");
            System.out.print("Please enter your choice (1-4): ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();
                    
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("Successfully deposited ₹%.2f\n", depositAmount);
                    } else {
                        System.out.println("Invalid amount! Deposit must be greater than zero.");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount <= 0) {
                        System.out.println("Invalid amount! Withdrawal must be greater than zero.");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Transaction Failed! Insufficient balance.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.printf("Successfully withdrew ₹%.2f\n", withdrawAmount);
                    }
                    break;

                case 3:
                    System.out.printf("Your current balance is: ₹%.2f\n", balance);
                    break;

                case 4:
                    running = false;
                    System.out.println("Thank you for banking with us. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option from the menu.");
            }
        }
    }
}
