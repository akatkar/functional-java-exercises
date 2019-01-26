package com.akatkar.functional.exercises.samples.primes;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.partitioningBy;

/**
 *
 * @author Ali Katkar
 */
public class PrimeNumbers3 {

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int nRoot = (int) Math.sqrt((double) n);
        return IntStream.rangeClosed(2, nRoot)
                .noneMatch(i -> n % i == 0);
    }

    private static Map<Boolean, List<Integer>> partitionPrimes(int n) {
        return IntStream.rangeClosed(0, n)
                .boxed()
                .collect(
                        partitioningBy(PrimeNumbers3::isPrime)
                );
    }

    public static void main(String[] args) {

        System.out.println(partitionPrimes(50));

    }

}
