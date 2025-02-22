package Practical2Q3;

public class Main {
    public static void main(String[] args) {
        UnitConversion[] unitArray = new UnitConversion[10];
        System.out.println("Inches\tCentimeter\tCentimeter\tInches");
        for (int index = 0; index < 10; index++) {
            unitArray[index] = new UnitConversion((double) (index + 1));
            System.out.printf("%-8.1f%-12.2f%-12d%-8.2f%n", (double)(index + 1), unitArray[index].getCentimeterValue(),
                    (index + 1) * 5, unitArray[index].getInchesValue() * 5);
        }
    }
}
