package io.codelex.loops.exercises;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Roll two six-sided dices until their sum is your desired sum.");
        int userInput = input.nextInt();

        Random random1 = new Random();
        Random random2 = new Random();

        int min = 1;
        int max = 6;

        int randomNumber1 = random1.nextInt((max - min) + 1) + min;
        int randomNumber2 = random2.nextInt((max - min) + 1) + min;
        int sumOfNumbers = randomNumber1 + randomNumber2;

        if (sumOfNumbers != userInput) {
            do {
                randomNumber1 = random1.nextInt((max - min) + 1) + min;
                randomNumber2 = random2.nextInt((max - min) + 1) + min;

                sumOfNumbers = randomNumber1 + randomNumber2;

                System.out.println(randomNumber1 + " and " + randomNumber2 + " = " + sumOfNumbers);
                userInput = input.nextInt();
            }
            while (sumOfNumbers != userInput);
        }
        System.out.println(randomNumber1 + " and " + randomNumber2 + " = " + sumOfNumbers);
    }
}

