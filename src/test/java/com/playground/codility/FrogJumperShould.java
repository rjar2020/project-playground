package com.playground.codility;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrogJumperShould {

    @Test
    void determine_jumps_from_X_to_Y() {
        var mapResult = Map.of(
                new TestScenario(10, 85, 30), 3,
                new TestScenario(10, 85, 100), 1,
                new TestScenario(0, 1_000_000_000, 1), 1_000_000_000,
                new TestScenario(3, 999_111_321, 7), 142_730_189
        );
        mapResult.forEach((testScenario, result) -> assertEquals(
                result,
                FrogJumper.solution(testScenario.getOrigin(), testScenario.getEnd(), testScenario.getJumpSteps())
        ));
    }

    @Test
    void return_zero_for_invalid_inputs() {
        var mapResult = Map.of(
                new TestScenario(85, 10, 30), 0,
                new TestScenario(0, 1_000_000_001, 100), 0,
                new TestScenario(1_000_000_001, 1_000_000_010, 1), 0
        );
        mapResult.forEach((testScenario, result) -> assertEquals(
                result,
                FrogJumper.solution(testScenario.getOrigin(), testScenario.getEnd(), testScenario.getJumpSteps())
        ));
    }

    private class TestScenario {
        private final int origin;
        private final int end;
        private final int jumpSteps;

        public TestScenario(int origin, int end, int jumpSteps) {
            this.origin = origin;
            this.end = end;
            this.jumpSteps = jumpSteps;
        }

        public int getOrigin() {
            return origin;
        }

        public int getEnd() {
            return end;
        }

        public int getJumpSteps() {
            return jumpSteps;
        }
    }
}
