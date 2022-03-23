package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int numerator = 0;

        while (true) {
            try {
                System.out.print("Enter the numerator: ");
                String numeratorString = scanner.next();
                if (numeratorString.substring(0, 1).equalsIgnoreCase("q")) {
                    break;
                } else {
                    numerator = Integer.parseInt(numeratorString);
                    System.out.print("Enter the divisor: ");
                    int divisor = scanner.nextInt();
                    System.out.println(numerator + " / " + divisor + " = " + numerator / divisor + "\n");
                }
            } catch (ArithmeticException e) {
                System.out.println("You can't divide " + numerator + " by 0\n");
            } catch (Exception e) {
                System.out.println("You entered bad data.\nPlease try again.\n");
                scanner.next();
            }
        }
    }
}
