package com.playground.codility;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimalDifferenceCalculatorShould {

    @Test
    public void calculate() {
        var resultScenarios = Map.of(
                new int[] {3, 1, 2, 4, 3}, 1,
                new int[] {1, 3}, 2,
                new int[] {}, 0
        );
        resultScenarios.forEach((input, result) -> assertEquals(result, MinimalDifferenceCalculator.solution(input)));
    }
}
