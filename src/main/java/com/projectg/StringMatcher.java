package com.projectg;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class StringMatcher {

    private StringMatcher(){}

    public static String findFirstNonRepeatedMatch(String input) {
        var resultMap = getCharacterOccurrenceMap(input);
        return resultMap.entrySet()
                .stream().filter(entry -> entry.getValue() == 1 )
                .findFirst().map(Map.Entry::getKey)
                .orElse("");
    }

    public static Boolean isAnagram(String left, String right) {
        var leftResultMap = getCharacterOccurrenceMap(left);
        var rightResultMap = getCharacterOccurrenceMap(right);
        return leftResultMap.equals(rightResultMap);
    }

    private static Map<String, Integer> getCharacterOccurrenceMap(String input) {
        return input.chars()
                .mapToObj(c -> String.valueOf((char)c))
                .collect(Collectors.toMap(
                        Function.identity(),
                        value -> 1,
                        Integer::sum,
                        LinkedHashMap::new));
    }

    //Committed versions :-(
    /*
    public static String find(String input) {
        var resultMap = new LinkedHashMap<Character, Integer>();
        for(var i = 0; i< input.length(); i++) {
            var charKey = input.charAt(i);
            resultMap.merge(charKey, 1, Integer::sum);
        }
        for (Map.Entry<Character, Integer> entry : resultMap.entrySet()){
            if(entry.getValue() == 1) {
                return String.valueOf(entry.getKey());
            }
        }
        return "";
    }

    public static Boolean getAnagram(String left, String right) {
        var leftResultMap = new HashMap<Character, Integer>();
        for(var i = 0; i< left.length(); i++) {
            var charKey = left.charAt(i);
            leftResultMap.merge(charKey, 1, Integer::sum);
        }
        var rightResultMap = new HashMap<Character, Integer>();
        for(var i = 0; i< right.length(); i++) {
            var charKey = right.charAt(i);
            rightResultMap.merge(charKey, 1, Integer::sum);
        }
        return leftResultMap.equals(rightResultMap);
    }
    */
}
