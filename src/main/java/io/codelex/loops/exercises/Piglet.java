package io.codelex.loops.exercises;

import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Piglet! Do you want to roll a dice? y/n");
        String userInput = input.nextLine().toLowerCase();

        int points = 0;

        if (userInput.equals("y")) {
            do {
                Random randomNumber = new Random();
                int min = 1;
                int max = 6;
                int rolledNumber = randomNumber.nextInt((max - min) + 1) + min;

                if (rolledNumber > 1) {
                    points += rolledNumber;
                    System.out.println("You rolled a " + rolledNumber + "!\nRoll again?");
                    userInput = input.nextLine();
                    if (userInput.equals("n")) {
                        System.out.println("You got " + points + " points.");
                    }
                } else {
                    System.out.println("You rolled a 1!\nYou got 0 points.");
                    break;
                }
            }
            while (userInput.equals("y"));
        } else {
            System.out.println("You got " + points + " points.");
        }
    }
}
