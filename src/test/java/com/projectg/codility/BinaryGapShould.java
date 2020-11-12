package com.projectg.codility;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryGapShould {

    @Test
    void return_biggest_binary_gap() {
        var mapResult = Map.of(
                529, 4,
                20, 1,
                2147483647, 0,
                1376796946, 5,
                328, 2,
                1162, 3,
                66561, 9
        );
        mapResult.forEach((input, result) -> assertEquals(result, BinaryGap.get(input)));
        mapResult.forEach((input, result) -> assertEquals(result, TailRecBinaryGap.solution(input)));
    }

    @Test
    void return_zero_for_edge_cases() {
        var edgeInputs = List.of(1, -2147483647, -1, 0);
        edgeInputs.forEach(input -> assertEquals(0, BinaryGap.get(input)));
        edgeInputs.forEach(input -> assertEquals(0, TailRecBinaryGap.solution(input)));
    }
}

