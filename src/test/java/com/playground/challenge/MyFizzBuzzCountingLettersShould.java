package com.playground.challenge;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFizzBuzzCountingLettersShould {

    @Test
    public void repeatLettersUntilLimit() {
        Map.of(
                new TestScenario("aaabbbcccaaa", 2), "aabbccaa",
                new TestScenario("ab", 2), "ab",
                new TestScenario("aaabbbcccaaa", 1), "abca",
                new TestScenario("abc", 10), "abc",
                new TestScenario("abc", 0), ""

        ).forEach((input, expectedResult) ->
                assertEquals(expectedResult, MyFizzBuzzCountingLetters.filter(input.getTarget(), input.getLimit()))
        );
    }


    private static class TestScenario {
        private final String target;
        private final int limit;

        TestScenario(String input, int limit) {
            this.target = input;
            this.limit = limit;
        }

        public String getTarget() {
            return target;
        }

        public int getLimit() {
            return limit;
        }
    }
}
