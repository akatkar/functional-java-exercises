package com.akatkar.functional.exercises.chapter2.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * All exercises should be completed using Lambda expressions and the new
 * methods added to JDK 8 where appropriate. There is no need to use an explicit
 * loop in any of the code. Use method references rather than full lambda
 * expressions wherever possible.
 */
public class Exercise01 {

    /**
     * Exercise 1
     *
     * Create a new list with all the strings from original list converted to
     * lower case and print them out.
     */
    private void exercise1() {
        List<String> list = Arrays.asList(
                "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");

        List<String> newList = list.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        newList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new Exercise01()
                .exercise1();
    }
}
