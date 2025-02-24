package Practical5Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text : ");
        text = scanner.nextLine();

        text = text.toUpperCase();
        text = text.replaceAll("[AEIOU]","x");

        System.out.println("Modified text : " + text);
    }
}