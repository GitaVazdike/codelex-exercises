package io.codelex.classesandobjects.practice.exercise_3;

public class Odometer {
    private int mileage;
    private FuelGauge fuelGauge;
    private final int MAX_MILEAGE = 999999;
    private final int FUEL_ECONOMY = 10;

    public Odometer(int mileage, FuelGauge fuelGauge) {
        this.mileage = mileage;
        this.fuelGauge = fuelGauge;
    }

    public int getMileage() {
        return mileage;
    }

    void displayMileage() {
        System.out.println("Current mileage: " + mileage + " kilometers.");
    }

    void incrementMileage() {
        if (mileage < MAX_MILEAGE) {
            mileage++;
        } else mileage = 0;
    }

    public void decreaseFuelAmount(int kilometersTraveled) {
        if (kilometersTraveled % FUEL_ECONOMY == 0) {
            fuelGauge.burnFuel();
        }
    }
}
