package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of minutes: ");
        int minutesForCalculation = input.nextInt();

        int minutesInHour = 60;
        int hoursInDay = 24;
        int daysInYear = 365;

        int minutesInYear = minutesInHour * hoursInDay * daysInYear;
        int years = minutesForCalculation / minutesInYear;
        int remainingMinutes = minutesForCalculation % minutesInYear;
        int days = remainingMinutes / (hoursInDay * minutesInHour);

        System.out.println(minutesForCalculation + " minutes is " + years + " years and " + days + " days.");
    }
}
