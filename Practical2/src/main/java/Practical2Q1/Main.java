package Practical2Q1;

public class Main {
    public static void main(String[] args) {
        Number[] numArray = new Number[11];
        int index = 0;

        for (int num = 0; num <= 20; num +=2 ) {
            numArray[index] = new Number(num);
            index++;
        }

        System.out.println("\nNumber\tSquareRoot");

        for(Number num : numArray) {
            System.out.println(num.value + "\t\t" + num.squareRoot);
        }
    }
}