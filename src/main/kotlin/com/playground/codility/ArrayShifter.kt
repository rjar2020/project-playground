package com.playground.codility

object ArrayShifter {
    @JvmStatic
    fun solution(A: IntArray, K: Int): IntArray {
        val validRange = IntRange(0,100);
        if(A.isEmpty()
            || A.size <= K && K % A.size == 0
            || A.toSet().size == 1
            || !validRange.contains(A.size)
            || !validRange.contains(K)) {
            return A
        }
        val realShift = K % A.size;
        val tail = A.sliceArray(IntRange(A.size - realShift , A.size -1))
        val head = A.sliceArray(IntRange(0, A.size - realShift - 1))
        return tail + head
    }
}