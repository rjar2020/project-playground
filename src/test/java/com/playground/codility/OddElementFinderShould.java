package com.playground.codility;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddElementFinderShould {

    @Test
    void findTheValueOfTheUnpairedElement() {
        var mapResult = Map.of(
                new int[]{9, 3, 9, 3, 9, 7, 9}, 7,
                new int[]{}, 0,
                new int[]{1, 2}, 0,
                new int[]{1, 3, 1}, 3,
                new int[]{1, 1_000_000_001, 1}, 0,
                randomArrayGenerator(1_000_002, new int[]{9, 3}, 7), 0,
                randomArrayGenerator(999_999, new int[]{8, 4}, 13), 13
        );
        mapResult.forEach((input, result) -> assertEquals(result, OddElementFinder.solution(input)));
    }

    @Test
    void findTheValueOfTheUnpairedElementWithBestSolution() {
        var mapResult = Map.of(
                new int[]{9, 3, 9, 3, 9, 7, 9}, 7,
                new int[]{}, 0,
                new int[]{1, 2}, 0,
                new int[]{1, 3, 1}, 3,
                new int[]{1, 1_000_000_001, 1}, 0,
                randomArrayGenerator(1_000_002, new int[]{9, 3}, 7), 0,
                randomArrayGenerator(999_999, new int[]{8, 4}, 12), 12
        );
        mapResult.forEach((input, result) -> assertEquals(result, OddElementFinder.bestSolution(input)));
    }

    private static int[] randomArrayGenerator(int size, int[] paired, int odd) {
        return IntStream.range(0, size)
                .map((index) -> toValidValue(size, paired, odd, index))
                .toArray();
    }

    private static int toValidValue(int size, int[] paired, int odd, int index) {
        if (size - 2 == index) {
            return odd;
        } else if (index % 2 == 0) {
            return paired[0];
        } else {
            return paired[1];
        }
    }
}
