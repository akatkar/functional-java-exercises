package com.akatkar.functional.exercises.samples.generate;

import java.util.stream.Stream;

/**
 *
 * @author Ali Katkar
 */
public class GenerateExample1 {

    public static void main(String[] args) {
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
    }
}
