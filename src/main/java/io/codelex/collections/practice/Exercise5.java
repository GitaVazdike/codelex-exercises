package io.codelex.collections.practice;

import java.util.*;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int userInput = scanner.nextInt();
        System.out.println(isHappyNumber(userInput) ? "Happy Number" : "Unhappy Number");
    }

    public static boolean isHappyNumber(int number) {
        List<Integer> uniqueNumbers = new ArrayList<>();

        while (!uniqueNumbers.contains(number)) {
            uniqueNumbers.add(number);
            int value = 0;
            while (number > 0) {
                value += Math.pow(number % 10, 2);
                number /= 10;
            }
            number = value;
        }
        return number == 1;
    }
}




