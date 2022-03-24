package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        ArrayList<String> carsArrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println(carsArrayList);

        //todo - replace array with a HashSet and print out the results
        HashSet<String> carsHashSet = new HashSet<>(Arrays.asList(array));
        System.out.println(carsHashSet);

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        HashMap<String, String> carOrigin = new HashMap<>();
        carOrigin.put("Audi", "Germany");
        carOrigin.put("BMW", "Germany");
        carOrigin.put("Honda", "Japan");
        carOrigin.put("Mercedes", "Germany");
        carOrigin.put("VolksWagen", "Germany");
        carOrigin.put("Tesla", "USA");

        System.out.println(carOrigin);
    }
}
