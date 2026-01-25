package com.binarysearchtree.universitydigitalrecordsystem;

public class Student {

     String name;
     int rollNo;
     Student left,right;
    
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;  
    }

} 