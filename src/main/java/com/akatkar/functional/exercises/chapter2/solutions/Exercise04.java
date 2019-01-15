package com.akatkar.functional.exercises.chapter2.solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * All exercises should be completed using Lambda expressions and the new
 * methods added to JDK 8 where appropriate. There is no need to use an explicit
 * loop in any of the code. Use method references rather than full lambda
 * expressions wherever possible.
 */
public class Exercise04 {

    /**
     * Count the number of lines in the file using the BufferedReader provided
     */
    private void exercise4() throws IOException {
        try (BufferedReader reader
                = Files.newBufferedReader(Paths.get("target/classes/SonnetI.txt"), StandardCharsets.UTF_8)) {
            
            long lineCount = reader.lines().count();
            System.out.println("Number of lines = " + lineCount);
        }
    }

    public static void main(String[] args) {
        try {
            new Exercise04()
                    .exercise4();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
