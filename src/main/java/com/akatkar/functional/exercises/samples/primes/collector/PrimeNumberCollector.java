package com.akatkar.functional.exercises.samples.primes.collector;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.IntStream;

import static java.util.stream.Collector.Characteristics.IDENTITY_FINISH;

/**
 *
 * @author Ali Katkar
 */
public class PrimeNumberCollector implements Collector<Integer, List<Integer>, List<Integer>> {

    private static boolean isPrime(Integer n) {
        if (n < 2) {
            return false;
        }
        int nRoot = (int) Math.sqrt((double) n);
        return IntStream.rangeClosed(2, nRoot)
                .noneMatch(i -> n % i == 0);
    }

    @Override
    public Supplier<List<Integer>> supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<Integer>, Integer> accumulator() {
        return (List<Integer> acc, Integer n) -> {
            if(isPrime(n))
                acc.add(n);
        };
    }

    @Override
    public BinaryOperator<List<Integer>> combiner() {
        return (List<Integer> list1, List<Integer> list2) -> {
            list1.addAll(list2);
            return list1;
        };
    }

    @Override
    public Function<List<Integer>, List<Integer>> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.unmodifiableSet(EnumSet.of(IDENTITY_FINISH));
    }
}
