package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {

        Map<String, Car> carMap = new HashMap<>();

        carMap.put("audi", new Audi());
        carMap.put("bmw", new Bmw());
        carMap.put("ford", new Ford());
        carMap.put("lexus", new Lexus());
        carMap.put("tesla", new Tesla());
        carMap.put("volkswagen", new Volkswagen());

        speedUpCars(carMap);
        displayFastestCar(carMap);

    }

    private static void speedUpCars(Map<String, Car> carMap) {
        for (int i = 0; i < 10; i++) {
            for (Car car : carMap.values()) {
                car.speedUp();
                if (i == 2 && car instanceof CarWithBoost) {
                    ((CarWithBoost) car).useNitrousOxideEngine();
                }
            }
        }
    }

    private static void displayFastestCar(Map<String, Car> carMap) {
        int maxSpeed = 0;
        String fastestCar = "";
        for (Map.Entry<String, Car> car : carMap.entrySet()) {
            if (car.getValue().getCurrentSpeed() > maxSpeed) {
                maxSpeed = car.getValue().getCurrentSpeed();
                fastestCar = car.getKey();
            }
        }
        System.out.println("Fastest car is " + fastestCar + ". Speed: " + maxSpeed);
    }

}
