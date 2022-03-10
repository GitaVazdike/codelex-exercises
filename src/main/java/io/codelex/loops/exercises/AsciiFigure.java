package io.codelex.loops.exercises;

public class AsciiFigure {
    private static final int SIZE = 7;
    private static final int BASE_NUMBER = 8;

    public static void main(String[] args) {
        int figureLength = SIZE * BASE_NUMBER - BASE_NUMBER;
        for (int i = 0; i < SIZE; i++) {
            int stars = i * BASE_NUMBER;
            for (int j = 0; j < figureLength; j++) {
                int symbolsLeft = (figureLength - stars) / 2;
                if (j < symbolsLeft) {
                    System.out.print("/");
                } else if (j >= symbolsLeft + stars) {
                    System.out.print("\\");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
