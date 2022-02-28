package io.codelex.loops.exercises;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        int min;
        int max;

        if (firstNumber < secondNumber) {
            min = firstNumber;
            max = secondNumber;
        } else {
            min = secondNumber;
            max = firstNumber;
        }

        for (int i = min; i <= max; i++) {

            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }

            for (int k = min; k < i; k++) {
                System.out.print(k);
            }

            System.out.println();
        }
    }
}
