package com.akatkar.functional.exercises.samples.intstream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 *
 * @author Ali Katkar
 */
public class RangeExample {

    public static void main(String[] args) {

        IntStream.range(5, 10)
                .forEach(System.out::print);

        System.out.println();
        
        LongStream.rangeClosed(5, 10)
                .forEach(System.out::print);

    }
}
