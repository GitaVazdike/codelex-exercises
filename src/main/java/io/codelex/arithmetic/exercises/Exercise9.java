package io.codelex.arithmetic.exercises;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight in kilograms:");
        double userWeight = input.nextInt();
        System.out.println("Enter your height in centimeters:");
        double userHeight = input.nextInt();

        double kgsToPounds = userWeight * 2.2046;
        double cmsToInches = userHeight * 0.3937;
        double bmi = kgsToPounds * 703 / Math.pow(cmsToInches, 2);

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("Your weight is optimal.");
        } else {
            System.out.println("You are overweight.");
        }
    }
}
