package io.codelex.arrays.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise8 {

    private static final String[] LIST_OF_WORDS = {
            "lauva", "hidroelektrostacija", "biezenis",
            "karātavas", "paprika", "karuselis",
            "ļaunums", "pērtiķis", "saulriets", "žubīte",
            "meteņi", "stāvlampa", "koncerttūre"
    };

    private static String wordToGuess = pickRandomWord(LIST_OF_WORDS);
    private static String guessedLetters = "_".repeat(wordToGuess.length());
    private static String missedGuesses = "";
    private static int numberOfTries = 8;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String lastUserGuess = "";
        String startEndLine = "-=".repeat(5 + wordToGuess.length()) + "-\n";

        System.out.println("Uzspēlēsim karātavas!");

        while (numberOfTries > 0) {

            System.out.println(startEndLine);
            System.out.println("Vārds:     " + formatWord(guessedLetters) + "\n");
            System.out.println("Kļūdas: " + missedGuesses + "\n");
            System.out.println("Minējums: " + lastUserGuess + "\n");
            System.out.println(startEndLine);
            System.out.println("Atlikušo mēģinājumu skaits " + numberOfTries + "\n");
            System.out.println("Ievadi burtu:");

            String inputLetter = input.nextLine().toLowerCase();
            lastUserGuess = inputLetter;

            if (checkIfStringContainsLetter(wordToGuess, inputLetter)) {
                fillGuessedLetters(inputLetter);
            }
            if (isWordGuessed()) {
                break;
            }
        }
        if (numberOfTries == 0) {
            System.out.println("Tu zaudēji! Minamais vārds bija " + wordToGuess.toUpperCase());
        }
    }

    private static String pickRandomWord(String[] stringArray) {
        Random random = new Random();
        int randomIndex = random.nextInt(stringArray.length);
        return stringArray[randomIndex];
    }

    private static boolean checkIfStringContainsLetter(String word, String letter) {
        if (!word.contains(letter)) {
            missedGuesses += letter;
            numberOfTries--;
            return false;
        }
        return true;
    }

    private static void fillGuessedLetters(String letter) {
        StringBuilder newGuess = new StringBuilder();
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == letter.charAt(0)) {
                newGuess.append(letter.charAt(0));
            } else if (guessedLetters.charAt(i) != '_') {
                newGuess.append(wordToGuess.charAt(i));
            } else {
                newGuess.append("_");
            }
        }
        guessedLetters = newGuess.toString();
    }

    private static boolean isWordGuessed() {
        if (guessedLetters.equals(wordToGuess)) {
            System.out.println("Pareizi! Tu uzvarēji! Minamais vārds bija " + wordToGuess.toUpperCase());
            return true;
        }
        return false;
    }

    private static String formatWord(String word) {
        StringBuilder formattedString = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            formattedString.append(word.charAt(i)).append(" ");
        }
        return formattedString.toString();
    }
}

