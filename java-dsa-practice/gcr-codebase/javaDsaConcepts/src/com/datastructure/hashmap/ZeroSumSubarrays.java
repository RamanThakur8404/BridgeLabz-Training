package com.datastructure.hashmap;

import java.util.*;

public class ZeroSumSubarrays {
    static void findZeroSumSubarrays(int[] arr) {
    	Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        // Important initialization
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    System.out.println("Subarray found from index " + (start + 1) + " to " + i);
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nZero Sum Subarrays:");
        findZeroSumSubarrays(arr);
    }
}
