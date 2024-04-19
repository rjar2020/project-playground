package com.playground.challenge;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class ClassicFizzBuzz {
    public static List<String> generate(long upperLimit){
        return LongStream.rangeClosed(1, upperLimit).mapToObj(
                i -> {
                    if(i % 15 == 0){
                        return "FizzBuzz";
                    } else if(i % 3 == 0){
                        return "Fizz";
                    } else if(i % 5 == 0){
                        return "Buzz";
                    } else {
                        return String.valueOf(i);
                    }
                }
        ).collect(Collectors.toList());
    }
}
