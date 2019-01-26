package com.akatkar.functional.exercises.samples.primes.collector;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 *
 * @author Ali Katkar
 */
public class PrimeNumbers {

    private static Map<Boolean, List<Integer>> partitionPrimes(int n) {
        return IntStream.rangeClosed(2, n)
                .boxed()
                .collect(new PrimeNumbersCollector());
    }

    public static void main(String[] args) {
        
        System.out.println(partitionPrimes(30));
    }
}
