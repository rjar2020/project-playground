package com.playground.codility;

import java.util.Arrays;
import java.util.Map;

public class NucleotidesMinImpactCalculator {

    private static final Map<String, Integer> NUCLEOTIDES_METADATA = Map.of(
            "A" , 1,
            "C", 2,
            "G", 3,
            "T", 4
    );

    public static int[] solution(String dnaSequence, int[] init, int[] end) {
        var result = new int[init.length];
        var dnaSequenceArray =
                dnaSequence.chars()
                        .mapToObj(c -> String.valueOf((char) c))
                        .map(c -> NUCLEOTIDES_METADATA.get(c.toUpperCase()))
                        .mapToInt(i -> i)
                        .toArray();
        for(var i = 0; i < init.length; i++) {
            result[i] = Arrays.stream(dnaSequenceArray, init[i],end[i] + 1).min().orElse(0);
        }
        return result;
    }
}
