package io.codelex.arithmetic.exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
        int userInput = input.nextInt();

        int comparableNumber = calculateRandomNumber();

        if (userInput < comparableNumber) {
            System.out.println("Sorry, you are too low. I was thinking of " + comparableNumber + ".");
        } else if (userInput > comparableNumber) {
            System.out.println("Sorry, you are too high. I was thinking of " + comparableNumber + ".");
        } else  {
            System.out.println("You guessed it!  What are the odds?!?");
        }
    }

    public static int calculateRandomNumber() {
        Random random = new Random();

        int min = 1;
        int max = 100;

        int randomNumber = random.nextInt((max - min) + 1) + min;

        return randomNumber;
    }
}


