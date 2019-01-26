package com.akatkar.functional.exercises.samples.fibo;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

/**
 *
 * @author Ali Katkar
 */
public class Fibo3_withGenerate {

    public static void main(String[] args) {

        IntSupplier fib = new IntSupplier() {
            private int previous = 0;
            private int current = 1;

            @Override
            public int getAsInt() {
                int oldPrevious = this.previous;
                int nextValue = this.previous + this.current;
                this.previous = this.current;
                this.current = nextValue;
                return oldPrevious;
            }
        };
        IntStream.generate(fib)
                .limit(10)
                .forEach(System.out::println);
    }
}
