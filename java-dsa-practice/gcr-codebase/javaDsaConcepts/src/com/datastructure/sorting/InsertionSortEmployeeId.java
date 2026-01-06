package com.datastructure.sorting;

import java.util.Scanner;

public class InsertionSortEmployeeId {
	public static void insertionSort(int []arr) {
		for(int i=1;i<arr.length;i++) {
			int currElement = arr[i];
			int j = i-1;
			
			while(j >= 0 && arr[j] > currElement) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = currElement;
		}
	}
	
	public static void printArray(int []arr) {
		for(int ele: arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
	}
	
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = scanner.nextInt();

        int[] empIds = new int[n];

        System.out.println("Enter employee IDs:");
        for (int i = 0; i < n; i++) {
            empIds[i] = scanner.nextInt();
        }

        System.out.println("Before Sorting:");
        printArray(empIds);

        insertionSort(empIds);

        System.out.println("After Sorting (Ascending Order):");
        printArray(empIds);

        scanner.close();		
	}
	
}
