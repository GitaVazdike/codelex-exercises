package io.codelex.polymorphism.practice.exercise1;

public class Volkswagen implements Car {
    private Integer currentSpeed = 0;

    @Override
    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void speedUp() {
        currentSpeed += 11;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 11;
    }

    @Override
    public void startEngine() {
        System.out.println("Brumm...");
    }

    @Override
    public String toString() {
        return "Volkswagen{"
                + "currentSpeed=" + currentSpeed
                + '}';
    }
}
