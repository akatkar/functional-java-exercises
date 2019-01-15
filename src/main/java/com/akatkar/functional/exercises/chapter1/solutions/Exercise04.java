package com.akatkar.functional.exercises.chapter1.solutions;

import java.util.Map;
import java.util.TreeMap;

/**
 * All exercises should be completed using Lambda expressions and the new
 * methods added to JDK 8 where appropriate. There is no need to use an explicit
 * loop in any of the code. Use method references rather than full lambda
 * expressions wherever possible.
 */
public class Exercise04 {

    /**
     * Exercise 4
     *
     * Convert every key-value pair of the map into a string and append them all
     * into a single string, in iteration order.
     */
    private void exercise4() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("c", 3);
        map.put("b", 2);
        map.put("a", 1);

        StringBuilder sb = new StringBuilder();
        map.forEach((k,v)-> sb.append(String.format("%s%s", k,v)));
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        new Exercise04()
                .exercise4();
    }
}
