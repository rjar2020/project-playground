package com.playground.codility;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeSet;

public class MinimalDifferenceCalculator {

    public static int solution(int[] input) {
        if (Objects.nonNull(input) && input.length > 1) {
            var result = new TreeSet<Integer>();
            var total = Arrays.stream(input, 0, input.length).sum();
            var leftSum = 0;
            var rightSum = 0;
            for (var i = 0; i < input.length - 1; i++) {
                leftSum += input[i];
                rightSum = total - leftSum;
                result.add(Math.abs(leftSum - rightSum));
            }
            return result.first();
        }
        return 0;
    }
}
