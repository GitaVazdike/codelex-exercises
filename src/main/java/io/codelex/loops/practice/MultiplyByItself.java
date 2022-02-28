package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i;
        int n;

        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

//        todo - complete loop to multiply i with itself n times, it is NOT allowed to use Math.pow()

        i = 4;

        for (int j = 1; j <= n; j++) {
            System.out.println(i *= i);
        }
    }
}







