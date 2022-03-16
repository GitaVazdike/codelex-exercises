package io.codelex.practice;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;

public class Exercise_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input server launch date (yyyy-mm-dd): ");
        String launchDate = input.nextLine();

        System.out.println("Enter a year to check for server update dates: ");
        int yearToCheck = input.nextInt();
        input.nextLine();

        System.out.println("Input month (in text format) to check for server update dates: ");
        String monthToCheck = input.nextLine().toUpperCase();

        LocalDate serverLaunchDate = LocalDate.parse(launchDate);
        int monthAsNumber = Month.valueOf(monthToCheck).getValue();
        LocalDate startOfMonthToCheck = LocalDate.of(yearToCheck, monthAsNumber, 1);
        LocalDate endOfMonthToCheck = startOfMonthToCheck.with(lastDayOfMonth());

        for (LocalDate date = serverLaunchDate.plusDays(14); date.isBefore(endOfMonthToCheck); date = date.plusDays(14)) {
            if (date.getYear() == yearToCheck && date.getMonthValue() == monthAsNumber) {
                System.out.println("Server must be updated on " + date);
            }
        }
    }
}
