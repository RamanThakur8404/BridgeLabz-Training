package com.datastructure.linkedlist.singly.studentrecordmanagement;

public class StudentRecordManager {
	    public static void main(String[] args) {
	        StudentLinkedList list = new StudentLinkedList();

	        list.addAtBeginning(1, "Ravi", 20, 'A');
	        list.addAtEnd(2, "Amit", 21, 'B');
	        list.addAtPosition(2, 3, "Neha", 19, 'A');

	        System.out.println("All Students:");
	        list.displayAll();

	        System.out.println("\nSearch Roll No 2:");
	        list.searchByRollNo(2);

	        System.out.println("\nUpdate Grade for Roll No 3:");
	        list.updateGrade(3, 'C');

	        System.out.println("\nDelete Roll No 1:");
	        list.deleteByRollNo(1);

	        System.out.println("\nFinal Records:");
	        list.displayAll();
	    }
}
