package com.playground.codility;

public class CircleInterceptor {
    public static int solution(int[] input) {
        var interceptedCircles = 0;
        for(var i = 0; i < input.length; i++) {
            if(input[i] > input.length - i) {
                interceptedCircles = interceptedCircles + (input.length - i);
            } else {
                interceptedCircles = interceptedCircles + input[i];
            }
        }
        return interceptedCircles;
    }
}
