package com.projectg;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;

public final class UtilSortTest {

    private UtilSortTest() {}

    public static int[] getDescendingOrderIntArray(int[] arrayToSort) {
        return Arrays.stream(Arrays.copyOf(arrayToSort, arrayToSort.length))
                .boxed()
                .sorted(Collections.reverseOrder()).mapToInt(i -> i)
                .toArray();
    }

    public static int[] getAscendingSortedIntArray(int[] arrayToSort) {
        return Arrays.stream(Arrays.copyOf(arrayToSort, arrayToSort.length))
                .sorted()
                .toArray();
    }

    public static int[] getRandomIntArray() {
        return IntStream.range(0, Math.abs(new Random().nextInt(10_000)) + 3)
                .map(i -> new Random().nextInt(100_000))
                .toArray();
    }
}
