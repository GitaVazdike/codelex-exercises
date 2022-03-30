package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {

    public Mouse(String animalType, String animalName, double animalWeight,
                 Integer foodEaten, String livingRegion) {
        super(animalType, animalName, animalWeight, foodEaten, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("Squeak-squeak");
    }

    @Override
    void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Mice are not eating that type of food!");
        } else {
            setFoodEaten(food.getQuantity());
        }
    }
}
