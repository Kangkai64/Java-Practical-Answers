
package Practical3Q2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] integerArray = {1, 2, 4, 5, 10, 100, 2, -22};

        System.out.println();
        System.out.println(Arrays.toString(integerArray));
        System.out.println("The index of the smallest element is " +
                getIndexOfSmallestElement(integerArray));
    }

    static int getIndexOfSmallestElement(int[] array) {
        int smallestElement = array[0];
        int smallestIndex = 0;
        for (int index = 1; index < array.length; index++) {
            if (array[index] < smallestElement) {
                smallestElement = array[index];
                smallestIndex = index;
            }
        }

        return smallestIndex;
    }
}
