package io.codelex.javaadvancedtest.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoinerTest {
    @Test
    void testJoin() {
        Joiner<Integer> joiner = new Joiner<>("-");
        String expectedResult = "1-2-3-5-7";

        String result = joiner.join(1, 2, 3, 5, 7);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void testJoin2() {
        Joiner<String> joiner1 = new Joiner<>("%*");
        String expectedResult = "three%*little%*piggies";

        String result = joiner1.join("three", "little", "piggies");
        Assertions.assertEquals(expectedResult, result);
    }
}
