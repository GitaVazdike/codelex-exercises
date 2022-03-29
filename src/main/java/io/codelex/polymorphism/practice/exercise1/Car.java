package io.codelex.polymorphism.practice.exercise1;

public interface Car {

    void speedUp();

    void slowDown();

    void startEngine();

    Integer getCurrentSpeed();

    default String showCurrentSpeed() {
        return getCurrentSpeed().toString();
    }
}
