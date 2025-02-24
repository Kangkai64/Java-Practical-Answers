package Practical4CQ1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Course introductionToComputers = new Course("Introduction to Computers", 250);

        introductionToComputers.addStudent("Ali Said");
        introductionToComputers.addStudent("Wong Ken");
        introductionToComputers.addStudent("Peter Lim");

        System.out.println(introductionToComputers.toString());

        for (int index = 0; index < introductionToComputers.getNumberOfStudents(); index++) {
            System.out.println("Student " + (index + 1) + ": " + introductionToComputers.getStudentNames()[index]);
        }
    }
}