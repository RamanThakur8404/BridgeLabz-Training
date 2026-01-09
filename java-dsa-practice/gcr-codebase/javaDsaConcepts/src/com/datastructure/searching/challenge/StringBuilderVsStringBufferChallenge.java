package com.datastructure.searching.challenge;
import java.util.ArrayList;
import java.util.List;

public class StringBuilderVsStringBufferChallenge {

    public static void main(String[] args) {

        // Create list of strings
        List<String> words = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            words.add("hello");
        }

        // ---------- StringBuilder ----------
        long startBuilder = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
        }

        long endBuilder = System.currentTimeMillis();

        System.out.println("StringBuilder Time (ms): " 
                + (endBuilder - startBuilder));


        // ---------- StringBuffer ----------
        long startBuffer = System.currentTimeMillis();

        StringBuffer sbuf = new StringBuffer();
        for (String word : words) {
            sbuf.append(word);
        }

        long endBuffer = System.currentTimeMillis();

        System.out.println("StringBuffer Time (ms): " 
                + (endBuffer - startBuffer));
    }
}
