package Practical1Q3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String creditCardNumber;
        long creditCardNumberLong;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your credit card number: ");
        // creditCardNumber = scanner.next();
        creditCardNumberLong = scanner.nextLong();
        // 43589795

        // CreditCard creditCard = new CreditCard(creditCardNumber);
        CreditCard creditCard = new CreditCard(creditCardNumberLong);

        if (creditCard.getValidCardNumber()){
            System.out.println("Your credit card number is valid");
        } else {
            System.out.println("Your credit card number is invalid");
        }
    }
}