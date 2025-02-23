package Practical4Q2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentID;
        String studentName;
        int numberOfQuizTaken = 0;

        System.out.print("Enter your student ID: ");
        studentID = scanner.nextLine();
        System.out.print("Enter your name: ");
        studentName = scanner.nextLine();
        Student student1 = new Student(studentID, studentName);
        Student student2 = new Student(studentID, studentName);

        System.out.print("Enter the number of quizzes taken: ");
        try{
            numberOfQuizTaken = scanner.nextInt();
        } catch (InputMismatchException InputMismatchException) {
            System.out.println("You entered an invalid number! Please try again.");
            scanner.nextLine();
        }
        if (numberOfQuizTaken < 0) {
            System.out.println("Number of quizzes taken is negative!");
        } else {
            student1.setNumberOfQuizTaken(numberOfQuizTaken);
        }

        int score;
        for (int index = 0; index < student1.getNumberOfQuizTaken(); index++) {
            score = -1;
            System.out.print("Enter the score for quiz " + (index + 1) + " : ");
            try{
                score = scanner.nextInt();
            } catch (InputMismatchException inputMismatchException){
                System.out.println("Invalid input. Please enter a number between 1 and 10");
                index--;
                scanner.nextLine();
                continue;
            }

            if (score < 0 || score > 10) {
                System.out.println("Invalid input. Please enter a number between 1 and 10");
                if ((score != -1)) {
                    index--;
                    scanner.nextLine();
                }
            } else {
                student1.addQuiz(score);
            }
        }

        System.out.println("\n=====================================");
        System.out.printf("Your student ID: %s\n", student1.getStudentID());
        System.out.printf("Your name: %s\n", student1.getName());
        System.out.printf("Total Score  : %d\n", student1.getTotalQuizScore());
        System.out.printf("Average score: %5.2f\n", student1.getAverageScore());
        System.out.printf("Coursework mark: %4.2f\n", student1.getCourseworkMark());
        System.out.println("======================================");
    }
}
