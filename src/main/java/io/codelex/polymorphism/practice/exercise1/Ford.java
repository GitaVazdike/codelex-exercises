package io.codelex.polymorphism.practice.exercise1;

public class Ford implements Car, CarWithBoost {
    private Integer currentSpeed = 0;

    @Override
    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void speedUp() {
        currentSpeed += 9;
    }

    @Override
    public void slowDown() {
        currentSpeed = -9;
    }

    @Override
    public void startEngine() {
        System.out.println("Brrr....");
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed += 35;
    }

    @Override
    public String toString() {
        return "Ford{"
                + "currentSpeed=" + currentSpeed
                + '}';
    }
}
