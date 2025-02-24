
package Practical3Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] DenominationArray = {
                {100, 0, 0},
                {50, 0, 0},
                {20, 0, 0},
                {10, 0, 0},
                {5, 0, 0},
                {1, 0, 0}
        };
        int totalDenomination = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the DenominationArray of each denomination: ");
        System.out.println("Denomination (RM)\t\tQuantity");

        for (int index = 0; index < DenominationArray.length; index++) {
            System.out.printf("%16d\t\t\t", DenominationArray[index][0]);
            DenominationArray[index][1] = scanner.nextInt();
            DenominationArray[index][2] = DenominationArray[index][0] * DenominationArray[index][1];
            totalDenomination += DenominationArray[index][2];
        }

        System.out.println("\nDenomination (RM)\t\tQuantity\t\t\tValue (RM)");
        for (int[] it : DenominationArray) {
            if (it[1] != 0) {
                System.out.printf("%16d", it[0]);
                System.out.printf("%14d\t\t\t", it[1]);
                System.out.printf("%14d\n", it[2]);
            }
        }

        System.out.printf("\nTotal = RM %.2f\n", (double)totalDenomination);
    }
}
