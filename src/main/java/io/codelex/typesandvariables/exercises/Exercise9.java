package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the distance you walked (in meters)");
        double distance = input.nextInt();
        System.out.println("Enter the hours you spent walking the distance");
        double hours = input.nextInt();
        System.out.println("Enter the minutes you spent walking the distance");
        double minutes = input.nextInt();
        System.out.println("Enter the seconds you spent walking the distance");
        double seconds = input.nextInt();

        double hoursToSeconds = hours * 3600;
        double minutesToSeconds = minutes * 60;
        double totalSeconds = hoursToSeconds + minutesToSeconds + seconds;

        double metersPerSecond = distance / totalSeconds;
        double kilometersPerHour = metersPerSecond * 3.6;
        double milesPerHour = kilometersPerHour / 1.609;

        System.out.println("Your speed in meters/second is " + String.format("%,.8f", metersPerSecond));
        System.out.println("Your speed in km/h is " + String.format("%,.8f", kilometersPerHour));
        System.out.println("Your speed in miles/h is " + String.format("%,.8f", milesPerHour));
    }
}


