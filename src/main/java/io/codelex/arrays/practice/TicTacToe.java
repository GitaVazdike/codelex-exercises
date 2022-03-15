package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];
    private static char currentPlayer;
    private static boolean gameActive = true;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        initBoard();
        displayBoard();

        while (gameActive) {
            determinePlayersTurn();

            int playerRowNumber = keyboard.nextInt();
            int playerColumnNumber = keyboard.nextInt();

            if (isValidInput(playerRowNumber, playerColumnNumber)) {
                do {
                    System.out.println("Invalid input. Use numbers 0-2.");
                    playerRowNumber = keyboard.nextInt();
                    playerColumnNumber = keyboard.nextInt();
                } while (isValidInput(playerRowNumber, playerColumnNumber));
            }

            if (board[playerRowNumber][playerColumnNumber] != ' ') {
                do {
                    System.out.println("This location is already occupied. Choose a different field.");
                    playerRowNumber = keyboard.nextInt();
                    playerColumnNumber = keyboard.nextInt();
                } while (board[playerRowNumber][playerColumnNumber] != ' ');
            }
            makeAMove(playerRowNumber, playerColumnNumber);
            checkGameStatus();
            displayBoard();
        }
    }

    private static void determinePlayersTurn() {
        char playerX = 'X';
        char playerO = 'O';
        if (currentPlayer == playerX) {
            System.out.println("Player 'O', choose your location (row: 0-2, column:0-2): ");
            currentPlayer = playerO;
        } else {
            System.out.println("Player 'X', choose your location (row: 0-2, column:0-2): ");
            currentPlayer = playerX;
        }
    }

    private static boolean isValidInput(int rowNumber, int columNumber) {
        return rowNumber < 0 || columNumber < 0 || rowNumber > 2 || columNumber > 2;
    }

    private static void makeAMove(int rowNumber, int columnNumber) {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                board[rowNumber][columnNumber] = currentPlayer;
            }
        }
    }

    private static boolean isWinner() {
        return (board[0][0] != ' ' && board[0][0] == board[0][1] && board[0][1] == board[0][2]
                || board[1][0] != ' ' && board[1][0] == board[1][1] && board[1][1] == board[1][2]
                || board[2][0] != ' ' && board[2][0] == board[2][1] && board[2][1] == board[2][2]
                || board[0][0] != ' ' && board[0][0] == board[1][0] && board[1][0] == board[2][0]
                || board[0][1] != ' ' && board[0][1] == board[1][1] && board[1][1] == board[2][1]
                || board[0][2] != ' ' && board[0][2] == board[1][2] && board[1][2] == board[2][2]
                || board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]
                || board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]);
    }

    private static boolean isTie() {
        int emptyFieldCount = 0;

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == ' ') {
                    emptyFieldCount += 1;
                }
            }
        }
        return (!isWinner() && emptyFieldCount == 0);
    }

    private static void checkGameStatus() {
        if (isTie()) {
            gameActive = false;
            System.out.println("The game is a tie.");
        } else if (isWinner()) {
            gameActive = false;
            System.out.println(currentPlayer + " won!");
        }
    }

    private static void initBoard() {
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    private static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }
}