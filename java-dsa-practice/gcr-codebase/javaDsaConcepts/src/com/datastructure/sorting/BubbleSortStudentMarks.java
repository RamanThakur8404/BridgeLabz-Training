package com.datastructure.sorting;

import java.util.Scanner;

public class BubbleSortStudentMarks {
	
	public static void bubbleSort(int[] marks) {
		
		for(int i=0;i<marks.length-1;i++) {
			boolean swapped = false;
				
			for(int j=0; j<marks.length-i-1; j++) {
				int temp ; 
				if(marks[j]>marks[j+1]) {
					temp = marks[j];
					marks[j] = marks[j+1];
					marks[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}
	
	public static void printArray(int[] marks) {
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
	
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[] marks = new int[n];

        // User-defined marks
        System.out.println("Enter student marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = scanner.nextInt();
        }

        System.out.println("Before Sorting:");
        printArray(marks);

        bubbleSort(marks);

        System.out.println("After Sorting (Ascending Order):");
        printArray(marks);

        scanner.close();		
	}
}
