package com.projectg;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstNonRepeatedShould {

    @Test
    void find_first_non_repeated_char() {
        var mapResult = Map.of(
                "ABCA", "B",
                "BCABAC", "",
                "BAC", "B",
                "BlohAtBloh", "A"
        );
        mapResult.forEach((input, result) -> assertEquals(result, StringMatcher.findFirstNonRepeatedMatch(input)));
    }

    @Test
    void determine_is_two_words_are_anagrams() {
        var mapResult = Map.of(
                new TestScenario("ABCD", "DABC") , true,
                new TestScenario("AABB", "BBAA"), true,
                new TestScenario("AAAB", "AAB"), false,
                new TestScenario("AAAB", "AABC"), false
        );
        mapResult.forEach((input, result) -> assertEquals(result, StringMatcher.isAnagram(input.getLeft(), input.getRight())));
    }

    private class TestScenario {
        private final String left;
        private final String right;

        public TestScenario(String left, String right) {
            this.left = left;
            this.right = right;
        }

        public String getLeft() {
            return left;
        }

        public String getRight() {
            return right;
        }
    }
}