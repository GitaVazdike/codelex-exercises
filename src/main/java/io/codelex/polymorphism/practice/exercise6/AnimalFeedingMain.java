package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnimalFeedingMain {

    private static List<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter info: "
                    + "{AnimalType} {AnimalName} {AnimalWeight} {AnimalLivingRegion} [{CatBreed} = Only if its cat]");
            String[] animalInfo = input.nextLine().split(" ");

            if (Arrays.stream(animalInfo).anyMatch(x -> x.equalsIgnoreCase("end"))) {
                System.out.println(animals);
                break;
            }

            System.out.println("Enter info: {FoodType} {quantity}");
            String[] foodInfo = input.nextLine().split(" ");

            Animal animal = createAnimal(animalInfo);
            Food food = createFood(foodInfo);

            animal.makeSound();
            animal.eat(food);

            System.out.println(animal);

            animals.add(animal);
        }
    }

    private static Animal createAnimal(String[] animalInfo) {
        if (animalInfo[0].equalsIgnoreCase("cat")) {
            return new Cat(animalInfo[0], animalInfo[1], Double.parseDouble(animalInfo[2]),
                    0, animalInfo[3], animalInfo[4]);
        } else if (animalInfo[0].equalsIgnoreCase("mouse")) {
            return new Mouse(animalInfo[0], animalInfo[1], Double.parseDouble(animalInfo[2]),
                    0, animalInfo[3]);
        } else if (animalInfo[0].equalsIgnoreCase("tiger")) {
            return new Tiger(animalInfo[0], animalInfo[1], Double.parseDouble(animalInfo[2]),
                    0, animalInfo[3]);
        } else {
            return new Zebra(animalInfo[0], animalInfo[1], Double.parseDouble(animalInfo[2]),
                    0, animalInfo[3]);
        }
    }

    private static Food createFood(String[] foodInfo) {
        String foodType = foodInfo[0];
        int quantity = Integer.parseInt(foodInfo[1]);

        if (foodType.equalsIgnoreCase("vegetable")) {
            return new Vegetable(quantity);
        } else {
            return new Meat(quantity);
        }
    }
}

