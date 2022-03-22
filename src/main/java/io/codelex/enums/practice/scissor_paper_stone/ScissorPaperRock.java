package io.codelex.enums.practice.scissor_paper_stone;

import java.util.Random;
import java.util.Scanner;

public class ScissorPaperRock {
    private static int computerWins = 0;
    private static int playerWins = 0;
    private static int trials = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Let us begin...");


        while (true) {
            System.out.print("Scissor-Paper-Stone\nYour turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
            String userInput = input.nextLine().toLowerCase();
            if (!isValidInput(userInput)) {
                System.out.println("Invalid input, try again...\n");
                continue;
            }
            if (userInput.equals("q")) {
                displayResult();
                break;
            }
            Shapes computerChoice = getComputersChoice();
            System.out.println("My turn: " + computerChoice);
            displayGameStatus(userInput, computerChoice);
        }
    }

    private static boolean isValidInput(String input) {
        return input.equals("s")
                || input.equals("p")
                || input.equals("t")
                || input.equals("q");
    }

    private static void displayResult() {
        double computerPercent = (double) computerWins / trials * 100;
        double playerPercent = (double) playerWins / trials * 100;
        System.out.println("Number of trials: " + trials);
        System.out.printf("I won %d(%.2f%%). You won %d(%.2f%%).\nBye!", computerWins, computerPercent, playerWins, playerPercent);
    }

    private static Shapes getComputersChoice() {
        Shapes[] shapesArray = Shapes.values();
        Random random = new Random();
        return shapesArray[random.nextInt(shapesArray.length)];
    }

    private static void displayGameStatus(String input, Shapes computerChoice) {
        Shapes playerChoice = null;
        switch (input) {
            case "s" -> playerChoice = Shapes.SCISSOR;
            case "p" -> playerChoice = Shapes.PAPER;
            case "t" -> playerChoice = Shapes.STONE;
        }

        trials++;
        if (computerChoice == playerChoice) {
            System.out.println("Tie!\n");
        } else if (computerChoice == Shapes.SCISSOR && playerChoice == Shapes.PAPER) {
            System.out.println("Scissor cuts paper, I won!\n");
            computerWins++;
        } else if (computerChoice == Shapes.PAPER && playerChoice == Shapes.STONE) {
            System.out.println("Paper wraps stone, I won!\n");
            computerWins++;
        } else if (computerChoice == Shapes.STONE && playerChoice == Shapes.SCISSOR) {
            System.out.println("Stone breaks scissor, I won!\n");
            computerWins++;
        } else {
            System.out.println("You won!\n");
            playerWins++;
        }
    }
}


