package io.codelex.enums.practice.cardinalpoints;

import java.util.EnumMap;
import java.util.Map;

public class TestCardinalPoints {
    public static void main(String[] args) {

        EnumMap<CardinalPoints, String> directions = new EnumMap<>(CardinalPoints.class);

        directions.put(CardinalPoints.NORTH, "up");
        directions.put(CardinalPoints.SOUTH, "down");
        directions.put(CardinalPoints.EAST, "right");
        directions.put(CardinalPoints.WEST, "left");

        for (Map.Entry<CardinalPoints, String> entry : directions.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue() + ":" + entry.getKey().ordinal());
        }
    }
}