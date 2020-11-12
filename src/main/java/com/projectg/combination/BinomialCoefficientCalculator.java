package com.projectg.combination;

import java.math.BigInteger;

public final class BinomialCoefficientCalculator {

    private BinomialCoefficientCalculator(){}

    public static BigInteger calculateCombinations(long n, long tuple) {
        if(tuple == 0 || n == 0) {
            return BigInteger.ZERO;
        }

        var bigN = BigInteger.valueOf(n);
        var bigTuple = BigInteger.valueOf(tuple);
        return factorial(bigN).divide(factorial(bigTuple).multiply(factorial(bigN.subtract(bigTuple))));
    }

    private static BigInteger factorial(BigInteger n) {
        if(BigInteger.ZERO.equals(n) || BigInteger.ONE.equals(n)) {
            return BigInteger.ONE;
        }
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
