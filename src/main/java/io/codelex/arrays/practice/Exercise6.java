package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {

        int[] randomNumberArray = new int[10];

        for (int i = 0; i < randomNumberArray.length; i++) {
            Random random = new Random();
            randomNumberArray[i] = random.nextInt(100 - 1) + 1;
        }

        int[] randomNumberArray2 = randomNumberArray.clone();

        randomNumberArray[randomNumberArray.length - 1] = -7;

        System.out.println(Arrays.toString(randomNumberArray));
        System.out.println(Arrays.toString(randomNumberArray2));
    }
}
