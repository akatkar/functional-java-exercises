package com.akatkar.functional.exercises.chapter1.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
     * Remove the words that have odd lengths from the list.
     */
    private void exercise2() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

        list.removeIf(s -> s.length()%2 == 1);
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new Exercise02()
                .exercise2();
    }
}
