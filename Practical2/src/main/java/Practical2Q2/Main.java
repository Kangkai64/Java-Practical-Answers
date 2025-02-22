package Practical2Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number < 0) {
            System.out.println("The square root of " + number + " is not a real number. Please enter a positive number.");
        } else {
            System.out.printf("The square root of %f is: %.8f", number, sqrt(number));
        }
    }

    public static double sqrt(double number) {
        double lowerLimit = 0;
        double upperLimit = 0;

        if (number == 0 || number == 1){
            return number;
        } else if (number > 1){
            lowerLimit = 1;
            upperLimit = number;
        } else if (number < 1){
            lowerLimit = number;
            upperLimit = 1;
        }

        double midpoint = 0;
        double precision = 1e-8;

        while ((upperLimit - lowerLimit) >= precision){
            midpoint = (lowerLimit + upperLimit) / 2.0;
            double midSquared = midpoint * midpoint;
            if (midSquared > number){
                upperLimit = midpoint;
            }
            else {
                lowerLimit = midpoint;
            }
        }

        return (lowerLimit + upperLimit) / 2.0;
    }
}
