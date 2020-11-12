package com.playground.codility;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class BinaryGap {
    public static int get(int N) {
        if(N < 1) {
            return 0;
        }
        var treeSet = new TreeSet<Integer>();
        getBinaryGap(Integer.toBinaryString(N), treeSet);
        return treeSet.isEmpty() ? 0 : treeSet.last();
    }

    private static void getBinaryGap(String binaryString, SortedSet<Integer> results) {
        if(binaryString.length() > 2) {
            var patternMatcher =
                    Pattern.compile("10+1").matcher(binaryString);
            if (patternMatcher.find()) {
                var match = patternMatcher.group();
                var remainingString = patternMatcher.replaceFirst(" 1");
                results.add(match.isEmpty() ? 0 : match.length() - 2);
                getBinaryGap(remainingString.trim(), results);
            }
        }
        results.add(0);
    }
}
