package io.codelex.exceptions.practice;

public class Exercise2 {
    public static void main(String[] args) {

        methodA();
    }

    public static void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw new ArithmeticException("Can't divide by 0");
        }
    }

    public static void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw new ArithmeticException("Can't divide by 0");
        }
    }

    public static void methodC() throws ArithmeticException {
        try {
            int number = 12;
            int divisor = 0;
            int division = number / divisor;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw new ArithmeticException("Can't divide by 0");
        }
    }
}

