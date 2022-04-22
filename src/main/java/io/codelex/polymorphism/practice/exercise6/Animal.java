package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

abstract class Animal {
    private final String animalType;
    private final String animalName;
    private final double animalWeight;
    private Integer foodEaten;
    DecimalFormat format = new DecimalFormat("0.#");

    public Animal(String animalType, String animalName, double animalWeight, Integer foodEaten) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public double getAnimalWeight() {
        return Double.parseDouble(format.format(animalWeight));
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    abstract void makeSound();

    abstract void eat(Food food);

}
