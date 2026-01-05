package com.datastructure.linkedlist.singly.studentrecordmanagement;

public class Student {
	protected int rollNo;
	protected String name;
	protected int age;
	protected char grade;
	Student next;
	
	public Student(int rollNo, String name, int age, char grade) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.next = null;
	}
}
