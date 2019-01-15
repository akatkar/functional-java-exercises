package com.akatkar.functional.exercises.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * All exercises should be completed using Lambda expressions and the new
 * methods added to JDK 8 where appropriate. There is no need to use an explicit
 * loop in any of the code. Use method references rather than full lambda
 * expressions wherever possible.
 */
public class Exercise05 {

    private static final String WORD_REGEXP = "[- .:,]+";

    /**
     * Using the BufferedReader to access the file, create a list of words with
     * no duplicates contained in the file. Print the words.
     *
     * HINT: A regular expression, WORD_REGEXP, is already defined for your use.
     */
    private void exercise5() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get("target/classes/SonnetI.txt"), StandardCharsets.UTF_8)) {
            
            /* YOUR CODE HERE */ 
        }
    }
    public static void main(String[] args) {
        try {
            new Exercise05()
                    .exercise5();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
