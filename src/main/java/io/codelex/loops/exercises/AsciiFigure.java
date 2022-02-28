package io.codelex.loops.exercises;

public class AsciiFigure {
    public static final int size = 7;

    public static void main(String[] args) {
        int figureLength = size * 8 - 8;
        for (int i = 0; i < size; i++) {
            int stars = i * 8;
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
