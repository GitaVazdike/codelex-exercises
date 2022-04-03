package io.codelex.javaadvancedtest.exercise4;

import java.io.*;

public class FileReader {
    private static final String PATH_TO_CLASS
            = "C:\\Users\\Gita\\IdeaProjects\\codelex-exercises\\src\\main\\java\\io\\codelex\\javaadvancedtest\\exercise4\\";

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new java.io.FileReader(PATH_TO_CLASS + "InputFile.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter(PATH_TO_CLASS + reverseString("OutputFile.txt")));

        String line;

        while ((line = in.readLine()) != null) {
            out.write(reverseString(line));
        }
        in.close();
        out.close();
    }

    private static String reverseString(String stringToReverse) {
        return new StringBuilder().append(stringToReverse).reverse().toString();
    }
}