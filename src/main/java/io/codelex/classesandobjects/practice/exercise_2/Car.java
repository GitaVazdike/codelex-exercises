package io.codelex.classesandobjects.practice.exercise_2;

public class Car {
    private double startKilometers;
    private double endKilometers;
    private double liters;


    public Car(double startOdo, double endingOdo, double liters) {
        startKilometers = startOdo;
        endKilometers = endingOdo;
        this.liters = liters;
    }

    public Car(double startOdo) {
        startKilometers = startOdo;
    }

    public double[] calculateConsumption() {
        double litersPer100km = liters / (endKilometers - startKilometers) * 100;
        double kilometersPerLitre = 100 / litersPer100km;
        double[] ar = new double[2];
        ar[0] = litersPer100km;
        ar[1] = kilometersPerLitre;
        return ar;
    }

    public boolean gasHog() {
        if (calculateConsumption()[0] > 15.0) {
            return true;
        }
        return false;
    }

    boolean economyCar() {
        if (calculateConsumption()[0] < 5.0) {
            return true;
        }
        return false;
    }

    void fillUp(int mileage, double liters) {
        endKilometers = mileage;
        this.liters = liters;
    }
}
