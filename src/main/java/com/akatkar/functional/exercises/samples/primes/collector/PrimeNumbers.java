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
                .collect(new PrimePartitionCollector());
    }

    private static List<Integer> primeNumbers(int n) {
        return IntStream.rangeClosed(2, n)
                .boxed()
                .collect(new PrimeNumberCollector());
    }

    public static void main(String[] args) {

        int upperLimit = 30;

        System.out.println("Prime Numbers until " + upperLimit);
        System.out.println(primeNumbers(upperLimit));

        System.out.println();

        System.out.println("Seperate numbers as prime or not until " + upperLimit);
        System.out.println(partitionPrimes(30));
    }
}
