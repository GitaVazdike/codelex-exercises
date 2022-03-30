package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {
    String breed;

    public Cat(String animalType, String animalName, double animalWeight, Integer foodEaten,
               String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    void eat(Food food) {
        setFoodEaten(food.getQuantity());
    }

    @Override
    public String toString() {
        return getAnimalType() + " [" + getAnimalName() + ", " + breed + ", "
                + getAnimalWeight() + ", " + getLivingRegion() + ", " + getFoodEaten() + "],";
    }
}
