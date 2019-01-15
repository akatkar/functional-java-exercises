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
public class Exercise03 {

    /**
     * Exercise 3
     *
     * Join the second, third and forth strings of the list into a single
     * string, where each word is separated by a hyphen (-). 
     * Print the resulting string.
     */
    private void exercise3() {
        List<String> list = Arrays.asList(
                "The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");

        /* YOUR CODE HERE */
    }

    public static void main(String[] args) {
        new Exercise03()
                .exercise3();
    }
}
