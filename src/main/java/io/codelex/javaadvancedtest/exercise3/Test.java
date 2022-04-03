package io.codelex.javaadvancedtest.exercise3;

public class Test {
    public static void main(String[] args) {

        Joiner<Integer> joiner1 = new Joiner<>("-");
        System.out.println(joiner1.join(1, 2, 3, 5, 7));

        Joiner<String> joiner2 = new Joiner<>("*");
        System.out.println(joiner2.join("three", "little", "piggies"));
    }
}
