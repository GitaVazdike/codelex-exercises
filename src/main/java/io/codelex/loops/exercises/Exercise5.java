package io.codelex.loops.exercises;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String firstWord = input.nextLine();
        System.out.println("Enter second word: ");
        String secondWord = input.nextLine();

        int wordLengthSum = firstWord.length() + secondWord.length();

        System.out.print(firstWord);
        for (int i = wordLengthSum; i < 30; i++) {
            System.out.print(".");
        }
        System.out.print(secondWord);
    }


}
