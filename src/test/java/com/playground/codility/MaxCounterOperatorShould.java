package com.playground.codility;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaxCounterOperatorShould {

    @Test
    public void executeCommands() {
        var resultScenarios = Map.of(
                new TestScenario(new int[]{3, 4, 4, 6, 1, 4, 4}, 5), new int[]{3, 2, 2, 4, 2},
                new TestScenario(new int[]{3, 4, 4, 7, 1, 4, 4}, 5), new int[]{},
                new TestScenario(null, 5), new int[]{},
                new TestScenario(new int[]{3, 4, 4, 7, 1, 4, 4}, 100_101), new int[]{},
                new TestScenario(IntStream.range(0, 100_102).toArray(), 100_103), new int[]{}

        );
        resultScenarios.forEach((input, result) -> assertArrayEquals(result, MaxCounterOperator.solution(input.getMaxBump(), input.getCommands())));
    }

    private static class TestScenario {
        private final int[] commands;
        private final int maxBump;

        public TestScenario(int[] commands, int maxBump) {
            this.commands = commands;
            this.maxBump = maxBump;
        }

        public int[] getCommands() {
            return commands;
        }

        public int getMaxBump() {
            return maxBump;
        }
    }
}
