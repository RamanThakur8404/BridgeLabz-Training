package com.datastructure.searching.search.binarysearch;
import java.util.Scanner;

public class PeakElement {

    static int findPeak(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            boolean leftSide = (mid == 0) || arr[mid] > arr[mid - 1];
            boolean rightSide = (mid == arr.length - 1) || arr[mid] > arr[mid + 1];

            // If mid is higher than both sides, it's a peak
            if (leftSide && rightSide) {
                return mid;
            }

            // If left side is higher, go left
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
            	high = mid - 1;
            }
            // Otherwise go right
            else {
                low = mid + 1;
            }
        }
        return -1; // safety
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peakIndex = findPeak(arr);

        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);

        sc.close();
    }
}