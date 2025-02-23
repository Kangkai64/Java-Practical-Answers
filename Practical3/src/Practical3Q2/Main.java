
package Practical3Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of quiz scores to process: ");
        int totalQuiz = scanner.nextInt();

        QuizProcessor quizProcessor = new QuizProcessor(totalQuiz);

        System.out.println("\nResults\n=======");
        System.out.println("Average is " + quizProcessor.getAverageScore());
        System.out.println("Number of scores above or equal to the average is " + quizProcessor.getTotalAboveOrEqualToAverageScore());
        System.out.println("Number of scores below the average is " + quizProcessor.getBelowAverageScore());
    }
}
