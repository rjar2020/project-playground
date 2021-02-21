package com.playground.codility;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingElementFinderShould {

    @Test
    public void findTheMissingElement() {
        //Using optionals this time to be able to store null scenarios
        var testScenarios = Map.of(
                Optional.of(new int[]{2, 3, 1, 5}), Optional.of(4),
                Optional.of(new int[]{1}), Optional.of(2),
                Optional.of(new int[]{1, 2}), Optional.of(3),
                Optional.of(new int[]{2, 3, 1, 4}), Optional.of(5),
                Optional.of(new int[]{2, 3, 5, 4}), Optional.of(1),
                Optional.of(new int[]{}), Optional.of(1),
                Optional.empty(), Optional.of(1)
        );
        testScenarios.forEach((input, result) -> {
            if (input.isEmpty()) {
                assertEquals(1, MissingElementFinder.solution(null));
            } else {
                assertEquals(result.orElseThrow(), MissingElementFinder.solution((int[]) input.get()));
            }
        });
    }

    @Test
    public void findTheMissingElementWithBestSolution() {
        //Using optionals this time to be able to store null scenarios
        var testScenarios = Map.of(
                Optional.of(new int[]{2, 3, 1, 5}), Optional.of(4),
                Optional.of(new int[]{1}), Optional.of(2),
                Optional.of(new int[]{1, 2}), Optional.of(3),
                Optional.of(new int[]{2, 3, 1, 4}), Optional.of(5),
                Optional.of(new int[]{2, 3, 5, 4}), Optional.of(1),
                Optional.of(new int[]{}), Optional.of(1),
                Optional.empty(), Optional.of(1)
        );
        testScenarios.forEach((input, result) -> {
            if (input.isEmpty()) {
                assertEquals(1, MissingElementFinder.bestSolution(null));
            } else {
                assertEquals(result.orElseThrow(), MissingElementFinder.bestSolution((int[]) input.get()));
            }
        });
    }
}
