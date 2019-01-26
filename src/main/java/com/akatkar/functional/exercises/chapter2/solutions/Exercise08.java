package com.akatkar.functional.exercises.chapter2.solutions;

import java.util.Arrays;

/**
 * All exercises should be completed using Lambda expressions and the new
 * methods added to JDK 8 where appropriate. There is no need to use an explicit
 * loop in any of the code. Use method references rather than full lambda
 * expressions wherever possible.
 */
public class Exercise08 {

    /**
     * Sort int array
     */
    private int[] sort(int[] a) {
         return Arrays
                .stream(a)
                .boxed()
                .sorted((x, y) -> x - y)
                .mapToInt(x -> x)
                .toArray();
    }

    private void exercise8() {
        int[] a = {1, 7, 3, 9, 8, 6, 2, 5, 4};

        Arrays.stream(sort(a))
              .forEach(System.out::print);
        System.out.println("");
    }

    public static void main(String[] args) {
        new Exercise08().exercise8();
    }
}
