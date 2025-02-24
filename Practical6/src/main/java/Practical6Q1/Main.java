package Practical6Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

       do {
           System.out.println("Welcome to the ATM machine");
           displayMenu1();
           choice = getChoice(choice, scanner);

           decisionPoint1(choice, scanner);
       } while (choice != 9);
    }

    public static void displayMenu1() {
        System.out.println("\nPlease choose one of the following options: ");
        System.out.println("1. Create a current account");
        System.out.println("2. Create a savings account");
        System.out.println("9. Exit");
    }

    public static void decisionPoint1(int choice, Scanner scanner) {
        CurrentAccount currentAccount = null;
        SavingsAccount savingsAccount = null;

        if (choice == 1) {
            currentAccount = new CurrentAccount();

        } else if (choice == 2) {
            savingsAccount = new SavingsAccount();

        } else if (choice == 9) {
            System.out.println("\nGoodbye!");
            return;
        }
        else {
            System.out.println("Invalid choice. Please try again.");
        }

        do {
            displayMenu2();
            choice = getChoice(choice, scanner);
            decisionPoint2(choice, currentAccount, savingsAccount, scanner);
        } while (choice != 9);
    }

    public static void displayMenu2() {
        System.out.println("\nPlease choose one of the following options: ");
        System.out.println("1. Withdraw Money");
        System.out.println("2. Deposit Money");
        System.out.println("9. Back");
    }

    public static void decisionPoint2(int choice, CurrentAccount currentAccount, SavingsAccount savingsAccount, Scanner scanner) {
        double amount = 0;

        if (choice > 0 && choice <= 2) {
           do {
               amount = getAmount(amount, scanner);
               if (amount < 0) {
                   System.out.println("Invalid amount. Please try again.");
               }
           } while (amount < 0);
        }

        if (choice == 1) {
            if (currentAccount != null) {
                currentAccount.withdrawal(amount);
            } else {
                savingsAccount.withdrawal(amount);
            }

        } else if (choice == 2) {
            if (currentAccount != null) {
                currentAccount.deposit(amount);
            } else {
                savingsAccount.deposit(amount);
            }

        } else if (choice == 9) {
            return;
        }
        else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    public static int getChoice(int choice, Scanner scanner) {
        System.out.print("\nEnter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public static double getAmount(double amount, Scanner scanner) {
        System.out.print("\nEnter the amount: ");
        amount = scanner.nextDouble();
        scanner.nextLine();
        return amount;
    }
}