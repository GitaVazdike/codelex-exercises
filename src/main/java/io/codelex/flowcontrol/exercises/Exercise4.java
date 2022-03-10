package io.codelex.flowcontrol.exercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 - 7: ");

        if (input.hasNextInt()) {
            int userInput = input.nextInt();
            printDayInWord(userInput);
        } else {
            System.out.println("Invalid input.");
        }
    }

    public static void printDayInWord(int dayNumber) {
        String day;

        switch (dayNumber) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Not a valid day";
        }
        System.out.println(day);
    }
}
