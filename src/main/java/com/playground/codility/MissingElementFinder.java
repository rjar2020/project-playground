package com.playground.codility;

import java.util.Arrays;
import java.util.Objects;

import static java.util.stream.Collectors.toSet;

public class MissingElementFinder {
    public static int solution(int[] input) {
        if (Objects.nonNull(input) && input.length != 0) {
            Arrays.sort(input);
            var inputSet = Arrays.stream(input).boxed().collect(toSet());
            if (!inputSet.contains(1)) {
                return 1;
            }
            if (!inputSet.contains(input.length + 1)) {
                return input.length + 1;
            }
            var left = 0;
            var right = input.length - 1;
            var mid = 0;
            while ((right - left) > 1) {
                mid = (left + right) / 2;
                if (input[left] - left != input[mid] - mid) {
                    right = mid;
                } else if (input[right] - right != input[mid] - mid) {
                    left = mid;
                }
            }
            return input[mid] + 1;
        }
        return 1;
    }

    public static int bestSolution(int[] input) {
        if (Objects.nonNull(input) && input.length != 0) {
            var x1 = input[0];
            var x2 = 1;

        /* For xor of all the elements
           in array */
            for (var i = 1; i < input.length; i++)
                x1 = x1 ^ input[i];

        /* For xor of all the elements
           from 1 to n+1 */
            for (var i = 2; i <= input.length + 1; i++)
                x2 = x2 ^ i;

            return (x1 ^ x2);
        }
        return 1;
    }
}
