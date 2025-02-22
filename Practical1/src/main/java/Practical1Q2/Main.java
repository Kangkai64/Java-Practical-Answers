package Practical1Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ageInYears = 0;

        System.out.println("-----------------------------------------------------------");
        System.out.print("Enter your age (years): ");
        ageInYears = scanner.nextInt();

        Person person = new Person(ageInYears);

        System.out.println("Age in years: " + person.getAgeInYears() + " years");
        System.out.println("Age in days: " + person.getAgeInDays() + " days");
        System.out.println("Age in seconds: " + person.getAgeInSeconds() + " seconds");

        System.out.println("-----------------------------------------------------------");
        System.out.println("Process Completed.");
        scanner.close();
    }
}