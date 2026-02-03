package com.collectors.wordfrequency;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyApp {
    public static void main(String[] args) {
        String paragraph = 
            "Java is fun. Java is powerful. Learning Java is exciting. " +
            "Java streams make coding easier. Java is everywhere.";

        System.out.println("Word Frequency Counter");
        System.out.println("Original paragraph:");
        System.out.println(paragraph+"\n");
        
        Map<String, Long> frequencyMap = Arrays.stream(paragraph.split("\\W+"))
                .filter(word -> !word.isEmpty())
                .map(String::toLowerCase)
                .collect(Collectors.toMap(
                        Function.identity(),      
                        word -> 1L,               
                        Long::sum                 
                ));

        frequencyMap.forEach((word, count) -> {
            System.out.println(word + " = " + count);
        });

        System.out.println("Total unique words: " + frequencyMap.size());
    }
}