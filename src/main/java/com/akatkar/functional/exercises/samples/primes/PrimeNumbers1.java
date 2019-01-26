package com.akatkar.functional.exercises.samples.primes;

import java.util.stream.IntStream;

/**
 *
 * @author Ali Katkar
 */
public class PrimeNumbers1 {

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        return IntStream.range(2, n)
                .noneMatch(i -> n % i == 0);
    }

    public static void main(String[] args) {

        IntStream.rangeClosed(0, 100)
                .filter(x -> isPrime(x))
                .forEach(System.out::println);

    }
}
