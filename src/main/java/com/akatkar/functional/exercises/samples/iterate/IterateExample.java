package com.akatkar.functional.exercises.samples.iterate;

import java.util.stream.Stream;

/**
 *
 * @author Ali Katkar
 */
public class IterateExample {

    public static void main(String[] args) {

        Stream.iterate(0, i -> i + 2)
                .limit(10)
                .forEach(System.out::println);

    }
}
