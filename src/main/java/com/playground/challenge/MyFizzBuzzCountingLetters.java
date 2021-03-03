package com.playground.challenge;

public class MyFizzBuzzCountingLetters {
    public static String filter(String input, int limit) {
        if (limit < 1) {
            return "";
        }
        var counter = 1;
        var actualChar = input.charAt(0);
        var previousChar = input.charAt(0);
        var result = new StringBuilder("" + actualChar);
        for (var i = 1; i < input.length(); i++) {
            actualChar = input.charAt(i);
            if (actualChar == previousChar) {
                if (counter < limit) {
                    result.append(actualChar);
                    counter++;
                }
            } else {
                previousChar = actualChar;
                result.append(previousChar);
                counter = 1;
            }
        }
        return result.toString();
    }
}
