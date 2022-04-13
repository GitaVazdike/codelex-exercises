package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Histogram {
    private static final Charset CHARSET = Charset.defaultCharset();
    private static final String FILE = "/collections/midtermscores.txt";
    private static final List<Integer> LIST_OF_SCORES = new ArrayList<>();
    private static final Map<String, String> HISTOGRAM = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();

        setListOfScores(scores);
        generateHistogram();

        for (String i : HISTOGRAM.keySet()) {
            System.out.println(i + ": " + HISTOGRAM.get(i));
        }
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Objects.requireNonNull(Histogram.class.getResource(FILE)).toURI());
        return Files.readAllLines(path, CHARSET).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private static void setListOfScores(String scores) {
        String[] array = scores.split(" ");
        for (String score : array) {
            LIST_OF_SCORES.add(Integer.parseInt(score));
        }
    }

    private static void generateHistogram() {
        HISTOGRAM.put("00-09", "");
        HISTOGRAM.put("10-19", "");
        HISTOGRAM.put("20-29", "");
        HISTOGRAM.put("30-39", "");
        HISTOGRAM.put("40-49", "");
        HISTOGRAM.put("50-59", "");
        HISTOGRAM.put("60-69", "");
        HISTOGRAM.put("70-79", "");
        HISTOGRAM.put("80-89", "");
        HISTOGRAM.put("90-99", "");
        HISTOGRAM.put("100", "");


        for (Integer score : LIST_OF_SCORES) {
            if (score < 10) {
                HISTOGRAM.put("00-09", HISTOGRAM.get("00-09") + "*");
            } else if (score < 20) {
                HISTOGRAM.put("10-19", HISTOGRAM.get("10-19") + "*");
            } else if (score < 30) {
                HISTOGRAM.put("20-29", HISTOGRAM.get("20-29") + "*");
            } else if (score < 40) {
                HISTOGRAM.put("30-39", HISTOGRAM.get("30-39") + "*");
            } else if (score < 50) {
                HISTOGRAM.put("40-49", HISTOGRAM.get("40-49") + "*");
            } else if (score < 60) {
                HISTOGRAM.put("50-59", HISTOGRAM.get("50-59") + "*");
            } else if (score < 70) {
                HISTOGRAM.put("60-69", HISTOGRAM.get("60-69") + "*");
            } else if (score < 80) {
                HISTOGRAM.put("70-79", HISTOGRAM.get("70-79") + "*");
            } else if (score < 90) {
                HISTOGRAM.put("80-89", HISTOGRAM.get("80-89") + "*");
            } else if (score < 100) {
                HISTOGRAM.put("90-99", HISTOGRAM.get("90-99") + "*");
            } else {
                HISTOGRAM.put("100", HISTOGRAM.get("100") + "*");
            }
        }
    }

}
