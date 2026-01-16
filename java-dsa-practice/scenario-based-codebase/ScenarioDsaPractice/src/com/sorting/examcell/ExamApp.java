package com.sorting.examcell;
import java.util.Scanner;

public class ExamApp {
	
	public static void mergeSort(Student []students, int start, int end) {
		if(start >= end) return;
		int mid = start + (end - start) /2;
		mergeSort(students,start,mid);
		mergeSort(students,mid+1,end);
		merge(students,start,mid,end);
	}
	
	public static void merge(Student []students, int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		int k = 0;
		Student []temp = new Student[high-low+1];
		
		while(i<mid && j<high) {
			if(students[i].score >= students[j].score) {
				temp[k++] = students[i++];
			}
			else {
				temp[k++] = students[j++];				
			}
		}
		while(i<=mid) {
			temp[k++] = students[i++];							
		}
		while(j<=high) {
			temp[k++] = students[j++];							
		}
		
		for(int start = i; start<high; start++) {
			students[start+low] = temp[start] ;
		}
	}

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter score: ");
            int score = scanner.nextInt();
            scanner.nextLine();

            students[i] = new Student(name, score);
        }

        mergeSort(students, 0, n - 1);

        System.out.println("\nState-Level Rank List:");
        int rank = 1;
        for (Student s : students) {
            System.out.println("Rank " + rank++ + " : " + s.name + " - " + s.score);
        }

        scanner.close();
    }
}
