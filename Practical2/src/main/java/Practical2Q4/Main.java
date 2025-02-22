package Practical2Q4;

public class Main {
    public static void main(String[] args) {
        double doubleNum1 = 3.5;
        double doubleNum2 = 4.5;
        double doubleNum3 = 5.0;
        Average average = new Average();

        System.out.println("-------------------------");
        System.out.println("Number 1: " + doubleNum1);
        System.out.println("Number 2: " + doubleNum2);
        System.out.println("Number 3: " + doubleNum3);
        System.out.println("-------------------------");

        System.out.println("The average of calculateAverage method with 2 integer parameters : " +
                average.calculateAverage((int)doubleNum1, (int)doubleNum2));
        System.out.println("The average of calculateAverage method with 3 integer parameters : " +
                average.calculateAverage((int)doubleNum1, (int)doubleNum2, (int)doubleNum3));
        System.out.println("The average of calculateAverage method with 2 double parameters : " +
                average.calculateAverage(doubleNum1, doubleNum2));
        System.out.println("The average of calculateAverage method with 3 double parameters : " +
                average.calculateAverage(doubleNum1, doubleNum2, doubleNum3));
    }
}
