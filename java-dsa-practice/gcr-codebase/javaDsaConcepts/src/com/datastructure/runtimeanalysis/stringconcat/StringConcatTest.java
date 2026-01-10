package com.datastructure.runtimeanalysis.stringconcat;
public class StringConcatTest {

    public static void main(String[] args) {

        int N = 10000; // try 1000 / 10000 (avoid 1,000,000 for String)

        long start, end;

        // String
        start = System.nanoTime();
        StringConcat.concatenate(N);
        end = System.nanoTime();
        System.out.println("String Time        : " + (end - start) + " ms");

        // StringBuilder
        start = System.nanoTime();
        StringBuilderConcat.concatenate(N);
        end = System.nanoTime();
        System.out.println("StringBuilder Time : " + (end - start) + " ms");

        // StringBuffer
        start = System.nanoTime();
        StringBufferConcat.concatenate(N);
        end = System.nanoTime();
        System.out.println("StringBuffer Time  : " + (end - start) + " ms");
    }
}
