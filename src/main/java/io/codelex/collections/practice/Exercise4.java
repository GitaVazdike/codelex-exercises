package io.codelex.collections.practice;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Set<String> uniqueNames = new HashSet<>();

        while (true) {
            System.out.print("Enter a name: ");
            String userInput = in.nextLine();

            uniqueNames.add(userInput);

            if (userInput.equals("")) {
                List<String> sortedList = new ArrayList<>(uniqueNames);
                Collections.sort(sortedList);

                System.out.print("Unique name list contains:");
                for (String name : sortedList) {
                    System.out.print(name + " ");
                }
                break;
            }
        }
    }
}
