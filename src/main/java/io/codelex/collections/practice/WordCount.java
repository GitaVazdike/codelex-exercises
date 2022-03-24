package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {

        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> lines = Files.readAllLines(path, charset);
        long lineCount = Files.lines(path).count();

        System.out.println("Lines = " + lineCount);
        System.out.println("Words = " + getWordCount(lines));
        System.out.println("Chars = " + getCharCount(lines));
    }

    private static int getWordCount(List<String> textLines) {
        int wordCount = 0;
        for (String line : textLines) {
            line = line.replace("'", " ").replace("  ", " ");
            String[] words = line.split(" ");
            wordCount += words.length;
        }
        return wordCount;
    }

    private static int getCharCount(List<String> textLines) {
        int charCount = 0;
        for (String line : textLines) {
            for (int i = 0; i < line.length(); i++) {
                charCount++;
            }
        }
        return charCount;
    }

}
