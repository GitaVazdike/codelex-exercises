package io.codelex.classesandobjects.practice.exercise_3;

public class FuelGauge {
    private int amountOfFuel;
    private final int MAXIMUM_LITERS = 70;

    public FuelGauge(int amountOfFuel) {
        this.amountOfFuel = amountOfFuel;
    }

    void displayAmountOfFuel() {
        System.out.println("Current amount of fuel: " + amountOfFuel + " liters.");
    }

    public int getAmountOfFuel() {
        return amountOfFuel;
    }

    void fillFuel() {
        while (amountOfFuel < MAXIMUM_LITERS) {
            amountOfFuel++;
        }
    }

    void burnFuel() {
        if (amountOfFuel > 0) {
            amountOfFuel--;
        }
    }
}