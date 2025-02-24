package Practical5Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word;
        char letter;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        word = scanner.nextLine();
        System.out.print("Enter a letter: ");
        letter = scanner.nextLine().charAt(0);

        System.out.printf("\"%s\" contains %d %c\n", word, countLetter(word, letter), letter);

    }

    public static int countLetter(String str, char ch){
        int count = 0;
        for(int index = 0; index < str.length(); index++){
            if(str.charAt(index) == ch){
                count++;
            }
        }

        return count;
    }
}