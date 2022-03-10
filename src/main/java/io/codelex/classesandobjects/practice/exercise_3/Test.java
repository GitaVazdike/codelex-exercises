package io.codelex.classesandobjects.practice.exercise_3;

public class Test {
    public static void main(String[] args) {

        FuelGauge fuelGauge = new FuelGauge(0);
        Odometer odometer = new Odometer(0, fuelGauge);

        odometer.displayMileage();
        fuelGauge.fillFuel();
        fuelGauge.displayAmountOfFuel();

        while (fuelGauge.getAmountOfFuel() > 0) {
            odometer.incrementMileage();
            odometer.decreaseFuelAmount(odometer.getMileage());
            odometer.displayMileage();
            fuelGauge.displayAmountOfFuel();
        }
    }
}
