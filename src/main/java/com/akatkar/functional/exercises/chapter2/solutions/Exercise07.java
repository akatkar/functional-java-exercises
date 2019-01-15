package com.akatkar.functional.exercises.chapter2.solutions;

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
public class Exercise07 {

    private static final String WORD_REGEXP = "[- .:,]+";

    /**
     * Modify exercise6 so that the words are sorted by length
     */
    private void exercise7() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get("target/classes/SonnetI.txt"), StandardCharsets.UTF_8)) {

            List<String> words = reader.lines()
                    .flatMap(line -> Stream.of(line.split(WORD_REGEXP)))
                    .map(String::toLowerCase)
                    .distinct()
                    .sorted(((a, b) -> a.length() - b.length()))
                    .collect(Collectors.toList());

            words.stream().forEach(System.out::println);
        }
    }

    public static void main(String[] args) {
        try {
            new Exercise07()
                    .exercise7();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
