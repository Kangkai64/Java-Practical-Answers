package Practical3;

import java.util.Scanner;

public class QuizProcessor {
    private int totalQuiz = 0;
    private int[] quizScore;
    private double averageScore = 0;
    private int totalAboveAverageScore = 0;
    private int totalBelowAverageScore = 0;

    Scanner scanner = new Scanner(System.in);

    QuizProcessor(int totalQuiz) {
        this.totalQuiz = totalQuiz;
        this.quizScore = new int[totalQuiz];
        getQuizScores();
        calculateAverageScore();
        calculateTotalAboveAverageScore();
    }

    void getQuizScores() {
        for (int index = 0; index < totalQuiz; index++) {
            System.out.print("Score " + (index + 1) + " : ");
            quizScore[index] = scanner.nextInt();
        }
    }

    void calculateAverageScore() {
        for (int index = 0; index < totalQuiz; index++) {
            averageScore += quizScore[index];
        }
        averageScore /= totalQuiz;
    }

    void calculateTotalAboveAverageScore() {
        for (int index = 0; index < totalQuiz; index++) {
            if (quizScore[index] > averageScore) {
                totalAboveAverageScore++;
            } else if (quizScore[index] < averageScore) {
                totalBelowAverageScore++;
            }
        }
    }

    public double getAverageScore() {
        return this.averageScore;
    }

    public int getTotalAboveOrEqualToAverageScore() {
        return this.totalAboveAverageScore;
    }

    public int getBelowAverageScore() {
        return this.totalBelowAverageScore;
    }
}
