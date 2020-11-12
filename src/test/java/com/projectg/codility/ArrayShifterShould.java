package com.projectg.codility;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayShifterShould {

    @Test
    void return_rotated_array() {
        var mapResult = Map.of(
                new TestScenario(new int[]{3, 8, 9, 7, 6}, 3) , new int[]{9, 7, 6, 3, 8},
                new TestScenario(new int[]{3, 8, 9, 7, 6}, 1) , new int[]{6, 3, 8, 9, 7}
        );
        mapResult.forEach((testScenario, result) -> assertArrayEquals(
                result,
                ArrayShifter.solution(testScenario.getInput(), testScenario.getShifts()))
        );
    }

    @Test
    void return_same_array_when_rotation_number_is_multiple_of_array_size() {
        var edgeInputs = getListOfRandomArrays();
        edgeInputs.forEach(input -> {
            var multiplier = new Random().nextInt(100);
            multiplier = multiplier == 0 ? 1 : multiplier;
            assertArrayEquals(input, ArrayShifter.solution(input, input.length * multiplier));
        });
    }

    @Test
    void return_same_array_when_all_values_are_same() {
        var input = new int[]{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
        assertArrayEquals(input, ArrayShifter.solution(input, 2));
    }

    @Test
    void return_same_array_when_array_size_bigger_than_100() {
        var input = new int[101];
        assertArrayEquals(input, ArrayShifter.solution(input, 2));
    }

    @Test
    void return_same_array_when_rotation_number_is_bigger_than_100() {
        var edgeInputs = getListOfRandomArrays();
        edgeInputs.forEach(input -> assertArrayEquals(input, ArrayShifter.solution(input, 101)));
    }

    private int[] getRandomIntArray() {
        return IntStream.range(0, new Random().nextInt(100))
                .map(i -> {
                    var generator = new Random();
                    return (generator.nextBoolean() ? 1 : -1) *
                            new Random().nextInt(1000);
                }).toArray();
    }

    private List<int[]> getListOfRandomArrays() {
        return IntStream.range(0, new Random().nextInt(100))
                .mapToObj(i -> getRandomIntArray())
                .collect(Collectors.toList());
    }

    class TestScenario {
        private int[] input;
        private int shifts;

        public TestScenario(int[] input, int shifts) {
            this.input = input;
            this.shifts = shifts;
        }

        public int[] getInput() {
            return input;
        }

        public int getShifts() {
            return shifts;
        }
    }
}
