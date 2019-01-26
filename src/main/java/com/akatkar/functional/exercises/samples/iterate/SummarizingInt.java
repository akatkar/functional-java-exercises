package com.akatkar.functional.exercises.samples.iterate;

import java.util.IntSummaryStatistics;
import static java.util.stream.Collectors.summarizingInt;
import java.util.stream.Stream;

/**
 *
 * @author Ali Katkar
 */
public class SummarizingInt {

    public static void main(String[] args) {
        Stream<Integer> myStream = Stream.iterate(1, i -> i + 1)
                .limit(10)
                .peek(System.out::println);
        
//        int total = myStream
//                .collect(summingInt(Integer::intValue));
//        System.out.println("total:" + total);
        
        IntSummaryStatistics stat = myStream
                .collect(summarizingInt(Integer::intValue));
        
        System.out.println(stat.getAverage());
    }
}
