package com.datastructure.linkedlist.singly.studentrecordmanagement;

public class StudentLinkedList {
    private Student head;

    // Add at beginning
    public void addAtBeginning(int rollNo, String name, int age, char grade) {
        Student newStudent = new Student(rollNo, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    // Add at end
    public void addAtEnd(int rollNo, String name, int age, char grade) {
        Student newStudent = new Student(rollNo, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newStudent;
    }

    // Add at specific position (1-based index)
    public void addAtPosition(int position, int rollNo, String name, int age, char grade) {
        if (position == 1) {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }

        Student newStudent = new Student(rollNo, name, age, grade);
        Student temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    // Delete by roll number
    public void deleteByRollNo(int rollNo) {
        if (head == null)
            return;

        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Student deleted");
            return;
        }

        Student temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo)
            temp = temp.next;

        if (temp.next == null) {
            System.out.println("Student not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student deleted");
        }
    }

    // Search by roll number
    public void searchByRollNo(int rollNo) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Student Found:");
                displayStudent(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Update grade
    public void updateGrade(int rollNo, char newGrade) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Display all students
    public void displayAll() {
        if (head == null) {
            System.out.println("No records available");
            return;
        }

        Student temp = head;
        while (temp != null) {
            displayStudent(temp);
            temp = temp.next;
        }
    }

    private void displayStudent(Student s) {
        System.out.println("Roll No: " + s.rollNo +
                ", Name: " + s.name +
                ", Age: " + s.age +
                ", Grade: " + s.grade);
    }
}

