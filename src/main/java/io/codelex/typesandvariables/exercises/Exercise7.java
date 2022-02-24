package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter some text!");
        String userInput = input.nextLine();

        while(userInput.matches("^[^a-zA-Z]+$")) {
            System.out.println("Invalid input! Enter some text!");
            userInput = input.nextLine();
        }

        int sumOfUpperCaseLetters = 0;

        for (int i = 0; i < userInput.length(); i++) {
            if (Character.isUpperCase(userInput.charAt(i))) {
                sumOfUpperCaseLetters++;
            }
        }

        if (sumOfUpperCaseLetters == 1) {
            System.out.println("There is 1 uppercase letter in the text you entered.");
        } else {
            System.out.println("There are " + sumOfUpperCaseLetters + " uppercase letters in the text you entered.");
        }
    }
}
