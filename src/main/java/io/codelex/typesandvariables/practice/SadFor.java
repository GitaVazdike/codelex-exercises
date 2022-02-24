package io.codelex.typesandvariables.practice;

public class SadFor {
    public static void main(String[] args) {
        System.out.println(test1());
    }

    public static int test1() {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            if (Math.sqrt(i) > 2.5) {
                result = i;
                break;
            }
        }
        return result;
    }
}
