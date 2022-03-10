package io.codelex.loops.exercises;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Roll two six-sided dices until their sum is your desired sum. Enter desired sum:");
        int userInput = input.nextInt();

        int randomNumber1 = findRandomNumberSum();
        int randomNumber2 = findRandomNumberSum();
        int sumOfNumbers = randomNumber1 + randomNumber2;

        if (sumOfNumbers != userInput) {
            do {
                randomNumber1 = findRandomNumberSum();
                randomNumber2 = findRandomNumberSum();
                sumOfNumbers = randomNumber1 + randomNumber2;
                if (sumOfNumbers == userInput) {
                    System.out.println("You won! " + randomNumber1 + " and " + randomNumber2 + " = " + sumOfNumbers);
                    break;
                }
                System.out.println("You missed! " + randomNumber1 + " and " + randomNumber2 + " = " + sumOfNumbers + "\nEnter desired sum:");
                userInput = input.nextInt();
            }
            while (sumOfNumbers != userInput);
        } else {
            System.out.println("You won! " + randomNumber1 + " and " + randomNumber2 + " = " + sumOfNumbers);
        }
    }

    public static int findRandomNumberSum() {
        Random random = new Random();
        int min = 1;
        int max = 6;
        return random.nextInt((max - min) + 1) + min;
    }
}

