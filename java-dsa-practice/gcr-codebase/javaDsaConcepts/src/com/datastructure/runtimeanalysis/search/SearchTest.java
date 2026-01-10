package com.datastructure.runtimeanalysis.search;
class SearchTest {
	public static void main(String[] args) {
        int N = 1_000_000;
        int[] data = new int[N];

        for (int i = 0; i < N; i++) {
            data[i] = i;
        }

        int target = N - 1;

        long startLinear = System.nanoTime();
        LinearSearch.search(data, target);
        long endLinear = System.nanoTime();

        long startBinary = System.nanoTime();
        BinarySearch.search(data, target);
        long endBinary = System.nanoTime();

        System.out.println("Linear Search Time  : " +
                (endLinear - startLinear) / 1_000_000.0 + " ms");

        System.out.println("Binary Search Time : " +
                (endBinary - startBinary) / 1_000_000.0 + " ms");
    }
}
