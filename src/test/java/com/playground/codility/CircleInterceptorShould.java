package com.playground.codility;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleInterceptorShould {

    @Test
    public void calculateAmountOfInterceptions() {
        Map.of(
                new int[]{1, 5, 2, 1, 4, 0}, 11
        ).forEach((input, expectedResult) ->
                assertEquals(expectedResult, CircleInterceptor.solution(input))
        );
    }
}
