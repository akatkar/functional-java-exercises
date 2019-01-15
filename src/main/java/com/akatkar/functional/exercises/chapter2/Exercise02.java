package com.akatkar.functional.exercises.chapter2;

import com.akatkar.functional.exercises.chapter1.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * All exercises should be completed using Lambda expressions and the new
 * methods added to JDK 8 where appropriate. There is no need to use an explicit
 * loop in any of the code. Use method references rather than full lambda
 * expressions wherever possible.
 */
public class Exercise02 {

    /**
     * Exercise 2
     *
     * Modify exercise 1 so that the new list only contains strings that have an
     * odd length
     */
    private void exercise2() {
        List<String> list = Arrays.asList(
                "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");

        /* YOUR CODE HERE */
    }

    public static void main(String[] args) {
        new Exercise02()
                .exercise2();
    }
}
