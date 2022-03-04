package io.codelex.arrays.practice;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {

        int[] randomNumberArray = new int[10];
        int[] randomNumberArray2 = new int[randomNumberArray.length];

        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = (int) (Math.random() * 100) + 1;
        }

        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray2[i] = randomNumberArray[i];
        }

        randomNumberArray[randomNumberArray.length - 1] = -7;

        System.out.println(Arrays.toString(randomNumberArray));
        System.out.println(Arrays.toString(randomNumberArray2));
    }
}
