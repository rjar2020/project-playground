package com.playground.codility

import java.util.*
import java.util.regex.Pattern

object TailRecBinaryGap {

    @JvmStatic
    fun solution(N: Int) = when {
        N < 1 -> 0
        else -> {
            val treeSet = TreeSet<Int>()
            getBinaryGap(Integer.toBinaryString(N), treeSet)
            if (treeSet.isEmpty()) 0 else treeSet.last()
        }
    }

    private tailrec fun getBinaryGap(binaryString: String, results: SortedSet<Int>) {
        if (binaryString.length < 3) {
            results.add(0)
            return
        }
        val patternMatcher = Pattern.compile("10+1").matcher(binaryString)
        if (patternMatcher.find()) {
            val match = patternMatcher.group()
            val remainingString = patternMatcher.replaceFirst(" 1")
            results.add(if (match.isEmpty()) 0 else match.length - 2)
            getBinaryGap(remainingString.trim(), results)
        }
    }

}