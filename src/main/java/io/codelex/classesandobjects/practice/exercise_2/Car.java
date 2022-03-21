package io.codelex.classesandobjects.practice.exercise_2;

public class Car {
    private double startKilometers;
    private double endKilometers;
    private double liters;

    private static final double GAS_HOG_CONSUMPTION = 15.0;
    private static final double ECONOMIC_CONSUMPTION = 5.0;


    public Car(double startOdo, double endingOdo, double liters) {
        startKilometers = startOdo;
        endKilometers = endingOdo;
        this.liters = liters;
    }

    public Car(double startOdo) {
        startKilometers = startOdo;
    }

    public double calculateConsumption() {
        return liters / (endKilometers - startKilometers) * 100;
    }

    public double kilometersPerLitre() {
        return 100 / calculateConsumption();
    }

    public boolean gasHog() {
        return calculateConsumption() > GAS_HOG_CONSUMPTION;
    }

    boolean economyCar() {
        return calculateConsumption() < ECONOMIC_CONSUMPTION;
    }

    void fillUp(int mileage, double liters) {
        endKilometers = mileage;
        this.liters = liters;
    }
}
