package com.akatkar.functional.exercises.samples.generate;

import java.util.stream.IntStream;

/**
 *
 * @author Ali Katkar
 */
public class GenerateExample2 {

    public static void main(String[] args) {

        IntStream ones = IntStream.generate(() -> 1);
        IntStream twos = IntStream.generate(() -> 2);
        
        ones.limit(5)
                .forEach(System.out::println);
        
        twos.limit(5)
                .forEach(System.out::println);
        
    }
}
