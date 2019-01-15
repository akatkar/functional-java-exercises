package com.akatkar.functional.exercises.chapter2.solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * All exercises should be completed using Lambda expressions and the new
 * methods added to JDK 8 where appropriate. There is no need to use an explicit
 * loop in any of the code. Use method references rather than full lambda
 * expressions wherever possible.
 */
public class Exercise06 {

    private static final String WORD_REGEXP = "[- .:,]+";

    /**
     * Using the BufferedReader to access the file create a list of words from
     * the file, converted to lower-case and with duplicates removed, which is
     * sorted by natural order. Print the contents of the list.
     */
    private void exercise6() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get("target/classes/SonnetI.txt"), StandardCharsets.UTF_8)) {

            List<String> words = reader.lines()
                    .flatMap(line -> Stream.of(line.split(WORD_REGEXP)))
                    .map(String::toLowerCase)
                    .distinct()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());

            words.stream().forEach(System.out::println);
        }
    }

    public static void main(String[] args) {
        try {
            new Exercise06()
                    .exercise6();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
