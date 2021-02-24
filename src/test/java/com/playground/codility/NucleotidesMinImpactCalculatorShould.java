package com.playground.codility;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NucleotidesMinImpactCalculatorShould {
    @Test
    public void executeCommands() {
        var resultScenarios = Map.of(
                new TestScenario(
                        new int[]{2, 5, 0},
                        new int[]{4, 5, 6},
                        "CAGCCTA"), new int[]{2, 4, 1}

        );
        resultScenarios.forEach((input, result) -> assertArrayEquals(
                result,
                NucleotidesMinImpactCalculator.solution(input.getDnaSequence(), input.getInit(), input.getEnd())));
    }

    private static class TestScenario {
        private final int[] init;
        private final int[] end;
        private final String dnaSequence;

        public TestScenario(int[] init, int[] end, String dnaSequence) {
            this.init = init;
            this.end = end;
            this.dnaSequence = dnaSequence;
        }

        public int[] getInit() {
            return init;
        }

        public int[] getEnd() {
            return end;
        }

        public String getDnaSequence() {
            return dnaSequence;
        }
    }

}
