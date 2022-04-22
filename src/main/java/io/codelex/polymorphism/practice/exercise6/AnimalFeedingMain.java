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

            createAnimal(animalInfo);
            createFood(foodInfo);

            createAnimal(animalInfo).makeSound();
            createAnimal(animalInfo).eat(createFood(foodInfo));

            System.out.println(createAnimal(animalInfo));

            animals.add(createAnimal(animalInfo));
        }
    }

    private static Animal createAnimal(String[] animalInfo) {
        Animal animal = null;
        if (animalInfo[0].equalsIgnoreCase("cat")) {
            animal = new Cat(animalInfo[0], animalInfo[1], Double.parseDouble(animalInfo[2]),
                    0, animalInfo[3], animalInfo[4]);
        } else if (animalInfo[0].equalsIgnoreCase("mouse")) {
            animal = new Mouse(animalInfo[0], animalInfo[1], Double.parseDouble(animalInfo[2]),
                    0, animalInfo[3]);
        } else if (animalInfo[0].equalsIgnoreCase("tiger")) {
            animal = new Tiger(animalInfo[0], animalInfo[1], Double.parseDouble(animalInfo[2]),
                    0, animalInfo[3]);
        } else if (animalInfo[0].equalsIgnoreCase("zebra")) {
            animal = new Zebra(animalInfo[0], animalInfo[1], Double.parseDouble(animalInfo[2]),
                    0, animalInfo[3]);
        }
        return animal;
    }

    private static Food createFood(String[] foodInfo) {
        Food food;
        String foodType = foodInfo[0];
        int quantity = Integer.parseInt(foodInfo[1]);

        if (foodType.equalsIgnoreCase("vegetable")) {
            food = new Vegetable(quantity);
        } else {
            food = new Meat(quantity);
        }
        return food;
    }
}

