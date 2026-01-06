package com.datastructure.sorting;
import java.util.Scanner;

public class SelectionSortExamScores {
    // selection sort method
    public static void selectionSort(int[] arr, int n) {

        // outer loop for each position
        for (int i = 0; i < n - 1; i++) {

            int min = Integer.MAX_VALUE;
            int minIdx = -1;

            // find minimum element in unsorted part
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter exam scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        selectionSort(scores, n);

        System.out.println("Sorted Exam Scores (Ascending Order):");
        for (int score : scores) {
            System.out.print(score + " ");
        }

        sc.close();
    }
}