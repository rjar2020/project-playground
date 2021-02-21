package com.playground.codility;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OddElementFinder {

    public static int bestSolution(int[] ar) {
        if (isInvalidInput(ar)) {
            return 0;
        }
        int res = 0;
        for (int j : ar) {
            res = res ^ j;
        }
        return res;
    }

    public static int solution(int[] input) {
        if (isInvalidInput(input)) {
            return 0;
        }
        return getOddElementIfPresent(input);
    }

    private static Integer getOddElementIfPresent(int[] input) {
        return getElementsCount(input).entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(0);
    }

    private static LinkedHashMap<Integer, Integer> getElementsCount(int[] input) {
        return Arrays.stream(input)
                .boxed()
                .collect(Collectors.toMap(
                        Function.identity(),
                        value -> 1,
                        Integer::sum,
                        LinkedHashMap::new));
    }


    private static boolean isInvalidInput(int[] ar) {
        return Objects.isNull(ar)
                || ar.length % 2 == 0
                || Arrays.stream(ar).max().getAsInt() > 1_000_000_000
                || ar.length > 999_999;
    }
}
