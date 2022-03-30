package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime {

    public Tiger(String animalType, String animalName, double animalWeight,
                 Integer foodEaten, String livingRegion) {
        super(animalType, animalName, animalWeight, foodEaten, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    void eat(Food food) {
        if (food instanceof Vegetable) {
            System.out.println("Tigers are not eating that type of food!");
        } else {
            setFoodEaten(food.getQuantity());
        }
    }
}
