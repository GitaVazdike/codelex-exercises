package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Exercise1 {

    private static final int WORKING_HOURS_PER_DAY = 8;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input start date(yyyy-mm-dd): ");
        String start = scan.nextLine();

        System.out.println("Input end date(yyyy-mm-dd): ");
        String end = scan.nextLine();

        LocalDate startDate = LocalDate.parse(start);
        LocalDate endDate = LocalDate.parse(end);

        System.out.println("From " + startDate + " to " + endDate + " employee has worked: "
                + calculateHoursWorked(startDate, endDate) + " hours");
    }

    private static boolean isWeekend(LocalDate date) {
        return date.getDayOfWeek().equals(DayOfWeek.SATURDAY) || date.getDayOfWeek().equals(DayOfWeek.SUNDAY);
    }

    private static int calculateHoursWorked(LocalDate start, LocalDate end) {
        int dayCount = 0;

        for (LocalDate date = start; date.isBefore(end.plusDays(1)); date = date.plusDays(1)) {
            if (!isWeekend(date)) {
                dayCount++;
            }
        }
        return WORKING_HOURS_PER_DAY * dayCount;
    }
}

