package io.codelex.arithmetic.exercises;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(Product1ToN(1, 10));
    }

    public static int Product1ToN(int start, int end) {
        int productOfNumbers = start;
        for (int i = start + 1; i <= end; i++) {
            productOfNumbers *= i;
        }
        return productOfNumbers;
    }
}
