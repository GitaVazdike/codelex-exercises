package io.codelex.loops.practice;

public class NaturalNumbers {

    public static void main(String[] args) {
        int i;

        // todo - write a program in Java to display the first 10 natural numbers
        StringBuilder firstTenNumbers = new StringBuilder();

        for (i = 1; i <= 10; i++) {
            firstTenNumbers.append(i).append(" ");
        }
        System.out.println("The first 10 natural numbers are: " + firstTenNumbers);
    }
}
