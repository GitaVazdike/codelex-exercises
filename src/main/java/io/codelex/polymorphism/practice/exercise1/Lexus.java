package io.codelex.polymorphism.practice.exercise1;

public class Lexus implements Car, CarWithBoost {
    private Integer currentSpeed = 0;

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    public void speedUp() {
        currentSpeed += 8;
    }

    public void slowDown() {
        currentSpeed -= 8;
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public String toString() {
        return "Lexus{"
                + "currentSpeed=" + currentSpeed
                + '}';
    }
}
