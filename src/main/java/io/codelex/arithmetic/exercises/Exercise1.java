package io.codelex.arithmetic.exercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = input.nextInt();

        System.out.println(checkInteger(firstNumber, secondNumber));

    }

    public static boolean checkInteger(int x, int y) {
        return (x == 15 || y == 15 || x + y == 15 || x - y == 15 || y - x == 15);
    }
}
