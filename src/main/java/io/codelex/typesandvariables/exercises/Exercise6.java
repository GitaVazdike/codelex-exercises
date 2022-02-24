package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter three single digit numbers.");

        int i = 0;
        int sum = 0;

        while (i < 3) {
            System.out.println("Enter a number.");
            Integer userInput = input.nextInt();
            if ((Integer.toString(userInput).length() > 1)) {
                System.out.println("Invalid input!");
                continue;
            } else {
                sum += userInput;
            }
            i++;
        }
        System.out.println("Sum of entered number is " + sum);
    }
}



