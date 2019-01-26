package com.akatkar.functional.exercises.samples.primes;

import java.util.stream.IntStream;

/**
 *
 * @author Ali Katkar
 */
public class PrimeNumbers2 {

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int nRoot = (int) Math.sqrt((double) n);
        return IntStream.rangeClosed(2, nRoot)
                .noneMatch(i -> n % i == 0);
    }

    public static void main(String[] args) {

        IntStream.rangeClosed(0, 100)
                .filter(x -> isPrime(x))
                .forEach(System.out::println);
    }

}
