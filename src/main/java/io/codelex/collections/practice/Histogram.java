package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";
    private static List<Integer> listOfScores = new ArrayList<>();
    private static Map<String, String> histogram = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();

        setListOfScores(scores);
        generateHistogram();

        for (String i : histogram.keySet()) {
            System.out.println(i + ": " + histogram.get(i));
        }
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Objects.requireNonNull(Histogram.class.getResource(file)).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private static void setListOfScores(String scores) {
        String[] array = scores.split(" ");
        for (String score : array) {
            listOfScores.add(Integer.parseInt(score));
        }
    }

    private static void generateHistogram() {
        int lessThanTenCount = listOfScores.stream().filter((Integer number) -> number < 10).toList().size();
        histogram.put("00-09", "*".repeat(lessThanTenCount));
        int tenToTwentyCount = listOfScores.stream().filter((Integer number) -> number >= 10 && number < 20).toList().size();
        histogram.put("10-19", "*".repeat(tenToTwentyCount));
        int twentyToThirtyCount = listOfScores.stream().filter((Integer number) -> number >= 20 && number < 30).toList().size();
        histogram.put("20-29", "*".repeat(twentyToThirtyCount));
        int thirtyToFortyCount = listOfScores.stream().filter((Integer number) -> number >= 30 && number < 39).toList().size();
        histogram.put("30-39", "*".repeat(thirtyToFortyCount));
        int fortyToFiftyCount = listOfScores.stream().filter((Integer number) -> number >= 40 && number < 49).toList().size();
        histogram.put("40-49", "*".repeat(fortyToFiftyCount));
        int fiftyToSixtyCount = listOfScores.stream().filter((Integer number) -> number >= 50 && number < 59).toList().size();
        histogram.put("50-59", "*".repeat(fiftyToSixtyCount));
        int sixtyToSeventyCount = listOfScores.stream().filter((Integer number) -> number >= 60 && number < 69).toList().size();
        histogram.put("60-69", "*".repeat(sixtyToSeventyCount));
        int seventyToEightyCount = listOfScores.stream().filter((Integer number) -> number >= 70 && number < 79).toList().size();
        histogram.put("70-79", "*".repeat(seventyToEightyCount));
        int eightyToNinetyCount = listOfScores.stream().filter((Integer number) -> number >= 80 && number < 89).toList().size();
        histogram.put("80-89", "*".repeat(eightyToNinetyCount));
        int ninetyToHundredCount = listOfScores.stream().filter((Integer number) -> number >= 90 && number < 99).toList().size();
        histogram.put("90-99", "*".repeat(ninetyToHundredCount));
        int hundredCount = listOfScores.stream().filter((Integer number) -> number == 100).toList().size();
        histogram.put("100", "*".repeat(hundredCount));
    }
}
