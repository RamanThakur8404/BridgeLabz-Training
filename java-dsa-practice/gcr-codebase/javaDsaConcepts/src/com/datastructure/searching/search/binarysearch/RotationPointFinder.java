package com.datastructure.searching.search.binarysearch;

import java.util.Scanner;

public class RotationPointFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the rotated sorted array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array(in rotated sorted array):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int rotationIndex = findRotationPoint(arr);

        System.out.println("The rotation point is at index: " + rotationIndex + " (Value: " + arr[rotationIndex] + ")");

        sc.close();
    }

    // Binary search to find rotation point
    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than rightmost, rotation point is in right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                // Else, rotation point is in left half (including mid)
                right = mid;
            }
        }

        // left == right, rotation point found
        return left;
    }
}