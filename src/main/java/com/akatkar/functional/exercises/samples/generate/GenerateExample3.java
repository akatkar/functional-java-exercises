package com.akatkar.functional.exercises.samples.generate;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

/**
 *
 * @author Ali Katkar
 */
public class GenerateExample3 {

    public static void main(String[] args) {

        IntSupplier triples = new IntSupplier() {
            private int value = 0;
            @Override
            public int getAsInt() {
                int current = value;
                value += 3;
                return current;
            }
        };
        
        IntStream.generate(triples)
                .limit(10)
                .forEach(System.out::println);
        
    }
}
