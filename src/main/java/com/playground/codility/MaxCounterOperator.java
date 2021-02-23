package com.playground.codility;

import java.util.Arrays;
import java.util.Objects;

public class MaxCounterOperator {

    private final static int MAX_VALUE = 100_000;

    public static int[] solution(int maxBump, int[] commands) {
        if (Objects.isNull(commands)
                || maxBump > MAX_VALUE
                || Arrays.stream(commands).max().orElse(0) > maxBump + 1) {
            return new int[]{};
        }
        var result = new int[maxBump];
        var max = 0;
        var lastMaxBump = 0;
        for (int command : commands) {
            if (command > maxBump) {
                lastMaxBump = max;
            } else {
                max = increment(result, max, lastMaxBump, command);
            }
        }
        bumpRemainingMax(result, lastMaxBump);
        return result;
    }

    private static void bumpRemainingMax(int[] result, int lastMaxBump) {
        for (var i = 0; i < result.length; i++) {
            if (result[i] < lastMaxBump) {
                result[i] = lastMaxBump;
            }
        }
    }

    private static int increment(int[] result, int max, int lastMaxBump, int command) {
        if (result[command - 1] < lastMaxBump) {
            result[command - 1] = lastMaxBump + 1;
        } else {
            result[command - 1]++;
        }
        if (result[command - 1] > max) {
            max = result[command - 1];
        }
        return max;
    }
}
