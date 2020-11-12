package com.projectg.combination.memoization

import java.math.BigInteger

object BinomialCoefficientMemoizedCalculator {

    @JvmStatic
    fun calculateCombinations(n: Long, tuple: Long): BigInteger {
        if (tuple == 0L || n == 0L) {
            return BigInteger.ZERO
        }
        val bigN = BigInteger.valueOf(n)
        val bigTuple = BigInteger.valueOf(tuple)
        return factorial(bigN).divide(factorial(bigTuple).multiply(factorial(bigN.subtract(bigTuple))))
    }

    private tailrec fun factorial(n: BigInteger, accumulator: BigInteger = BigInteger.ONE): BigInteger =
        when(n) {
            BigInteger.ZERO -> BigInteger.ONE
            BigInteger.ONE -> accumulator
            else -> factorial(n.subtract(BigInteger.ONE), n.multiply(accumulator))
        }
}