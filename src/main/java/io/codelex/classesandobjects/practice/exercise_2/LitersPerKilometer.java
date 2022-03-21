package io.codelex.classesandobjects.practice.exercise_2;

import java.util.Scanner;

public class LitersPerKilometer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double startKilometers;
        double endKilometers;
        double liters;

        System.out.println("Enter first reading: ");
        startKilometers = scan.nextDouble();

        System.out.println("Enter second reading: ");
        endKilometers = scan.nextDouble();

        System.out.println("Enter liters consumed: ");
        liters = scan.nextDouble();

        Car car1 = new Car(startKilometers, endKilometers, liters);
        displayResult(car1);

        System.out.println("Enter first reading for second car: ");
        startKilometers = scan.nextDouble();

        System.out.println("Enter second reading for second car: ");
        endKilometers = scan.nextDouble();

        System.out.println("Enter liters consumed for second car: ");
        liters = scan.nextDouble();

        Car car2 = new Car(startKilometers, endKilometers, liters);
        displayResult(car2);

        int i = 3;
        while (i > 0) {
            System.out.println("Enter first reading for third car: ");
            startKilometers = scan.nextDouble();

            System.out.println("Enter second reading for third car: ");
            endKilometers = scan.nextDouble();

            System.out.println("Enter liters filled: ");
            liters = scan.nextDouble();

            Car car3 = new Car(startKilometers);
            car3.fillUp((int) endKilometers, liters);
            displayResult(car3);
            i--;
        }
    }

    public static void displayResult(Car car) {
        System.out.print("Kilometers per liter are: " + String.format("%.2f", car.kilometersPerLitre()) + "\n");
        if (car.gasHog()) {
            System.out.println("This car is a gas hog.\n");
        } else if (car.economyCar()) {
            System.out.println("This is an economy car.\n");
        }
    }
}

