package io.codelex.polymorphism.practice.exercise1;

public class Tesla implements Car {
    private Integer currentSpeed = 0;

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    public void speedUp() {
        currentSpeed += 20;
    }

    public void slowDown() {
        currentSpeed -= 20;
    }

    public void startEngine() {
        System.out.println("-- silence ---");
    }

    @Override
    public String toString() {
        return "Tesla{"
                + "currentSpeed=" + currentSpeed
                + '}';
    }
}
