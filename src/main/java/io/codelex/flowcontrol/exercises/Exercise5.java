package io.codelex.flowcontrol.exercises;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");

        String userInput = input.nextLine().toLowerCase();
        PhoneKeyPad(userInput);

    }
    public static void PhoneKeyPad(String word) {
        int keyPadDigit = 0;
        for(int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'a', 'b', 'c' -> keyPadDigit = 2;
                case 'd', 'e', 'f' -> keyPadDigit = 3;
                case 'g', 'h', 'i' -> keyPadDigit = 4;
                case 'j', 'k', 'l' -> keyPadDigit = 5;
                case 'm', 'n', 'o' -> keyPadDigit = 6;
                case 'p', 'q', 'r', 's' -> keyPadDigit = 7;
                case 't', 'u', 'v' -> keyPadDigit = 8;
                case 'w', 'x', 'y', 'z' -> keyPadDigit = 9;
            }
            System.out.print(keyPadDigit);
        }
    }
}
