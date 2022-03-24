package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        ArrayList<String> groceryList = new ArrayList<>();

        //TODO: Add 10 values to list
        groceryList.add("Bread");
        groceryList.add("Cheese");
        groceryList.add("Chocolate");
        groceryList.add("Potatoes");
        groceryList.add("Milk");
        groceryList.add("Pasta");
        groceryList.add("Tomatoes");
        groceryList.add("Cereals");
        groceryList.add("Bacon");
        groceryList.add("Eggs");

        //TODO: Add new value at 5th position
        groceryList.add(4, "Grapes");

        //TODO: Change value at last position (Calculate last position programmatically)
        groceryList.set(groceryList.size() - 1, "Tomato sauce");

        //TODO: Sort your list in alphabetical order
        Collections.sort(groceryList);

        //TODO: Check if your list contains "Foobar" element
        if (groceryList.contains("Foobar")) {
            System.out.println("Foobar found.");
        } else {
            System.out.println("Foobar not found.");
        }

        //TODO: Print each element of list using loop
        for (String element : groceryList) {
            System.out.println(element);
        }
    }

}
