package io.codelex.polymorphism.practice.exercise6;

abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalType, String animalName, double animalWeight,
                  Integer foodEaten, String livingRegion) {
        super(animalType, animalName, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public String toString() {
        return getAnimalType() + " [" + getAnimalName() + ", "
                + getAnimalWeight() + ", " + livingRegion + ", " + getFoodEaten() + "],";
    }
}
