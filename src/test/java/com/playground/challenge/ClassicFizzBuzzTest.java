package com.playground.challenge;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassicFizzBuzzTest {

    @Test
    public void FizzBuzz_whenFizz() {
        var result = ClassicFizzBuzz.generate(3);
        assertEquals(result.get(2), "Fizz");
    }

    @Test
    public void FizzBuzz_whenBuzz() {
        var result = ClassicFizzBuzz.generate(5);
        assertEquals(result.get(4), "Buzz");
    }

    @Test
    public void FizzBuzz_whenFizzBuzz() {
        var result = ClassicFizzBuzz.generate(15);
        assertEquals(result.get(14), "FizzBuzz");
    }

    @Test
    public void FizzBuzz_whenNumber() {
        var result = ClassicFizzBuzz.generate(14);
        assertEquals(result.get(10), "11");
    }
}
