package com.akatkar.functional.exercises.samples.fibo;

import java.util.stream.Stream;

public class Fibo1 {

    public static void main(String[] args) {
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .forEach(t -> System.out.println("(" + t[0] + "," + t[1] +")"));
    }
}
