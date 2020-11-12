package com.playground.codility

import kotlin.math.ceil

object FrogJumper {

    @JvmStatic
    fun solution(origin: Int, end: Int, jumpSteps: Int): Int {
        val validRange = IntRange(0, 1_000_000_000)
        if(!validRange.contains(origin)
            || !validRange.contains(end)
            || !validRange.contains(jumpSteps)
            || origin > end) {
            return 0
        }
        return ceil((end.toDouble() - origin.toDouble()) / jumpSteps.toDouble()).toInt()
    }
}