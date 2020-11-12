package com.playground.combination;

import com.playground.combination.memoization.BinomialCoefficientMemoizedCalculator;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinomialCoefficientCalculatorShould {

    @Test
    void calculate_k_combinations_in_n() {
        var n = 8;
        var tuples = 2;
        assertEquals(BigInteger.valueOf(28), BinomialCoefficientCalculator.calculateCombinations(n, tuples));
        assertEquals(BigInteger.valueOf(28), BinomialCoefficientMemoizedCalculator.calculateCombinations(n, tuples));
    }

    @Test
    void return_zero_when_n_is_zero() {
        var n = 0;
        var tuples = 2;
        assertEquals(BigInteger.ZERO, BinomialCoefficientCalculator.calculateCombinations(n, tuples));
        assertEquals(BigInteger.ZERO, BinomialCoefficientMemoizedCalculator.calculateCombinations(n, tuples));
    }

    @Test
    void return_zero_when_tuples_is_zero() {
        var n = 5;
        var tuples = 0;
        assertEquals(BigInteger.ZERO, BinomialCoefficientCalculator.calculateCombinations(n, tuples));
        assertEquals(BigInteger.ZERO, BinomialCoefficientMemoizedCalculator.calculateCombinations(n, tuples));
    }

    @Test
    void return_one_when_n_is_one_and_tuples_is_one() {
        var n = 1;
        var tuples = 1;
        assertEquals(BigInteger.ONE, BinomialCoefficientCalculator.calculateCombinations(n, tuples));
        assertEquals(BigInteger.ONE, BinomialCoefficientMemoizedCalculator.calculateCombinations(n, tuples));
    }
}
