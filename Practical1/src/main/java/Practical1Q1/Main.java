package Practical1Q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String input;
        int yearOfStudy = -1;
        double GPA = -1; // -1 is a sentinel value to avoid false validation
        boolean validYearOfStudy = false;
        boolean validGPA = false;

        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();
        Student student2 = new Student("John", 4, 4.0);

        System.out.println("Enter name : ");
        input = scanner.nextLine();
        student1.setName(input);

        do {
            System.out.println("Enter your year of study : ");

            try{
                yearOfStudy = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid year of study. Please enter a number.");
                scanner.nextLine();
            }

            validYearOfStudy = yearOfStudy >= 0 && yearOfStudy <= 4;

            if (!validYearOfStudy) {
                System.out.println("Invalid year of study. Please try again.");
            }
            else {
                student1.setYearOfStudy(yearOfStudy);
            }

        } while (!validYearOfStudy);

        do {
            System.out.println("What is your target GPA for this semester? ");

            try{
                GPA = scanner.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("Invalid GPA. Please enter a valid number");
                scanner.nextLine();
            }

            validGPA = GPA >= 0.0 && GPA <= 4.0;

            if (!validGPA) {
                System.out.println("Invalid GPA. GPA must be between 0.0 and 4.0.\n Please try again.");
            }
            else {
                student1.setGPA(GPA);
            }

        }while (!validGPA);

        System.out.println("Welcome " + student1.getName() + "!");
        System.out.println("Work hard to achieve your target GPA of " + student1.getGPA() +
                " this semester of your Year " + student1.getYearOfStudy() + "!");
        scanner.close();
    }
}
