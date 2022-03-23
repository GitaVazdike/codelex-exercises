package io.codelex.exceptions.practice;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise3 {
    public static void main(String[] args) {

        File myFile = new File("file.txt");
        cat(myFile);
    }

    public static void cat(File file) {
        //TODO - fix this method so it compiles
        String line;

        try {
            RandomAccessFile input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("A problem occurred!");
        }
    }
}
