package com.generics.universitycoursemgmtsystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.List;

public class UniversityCourseManagementSystem {
    
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course.getEvaluationMethod());
        }
    }

    public static void main(String[] args) {
        Course<ExamCourse> examCourse = new Course<>("Math 101", new ExamCourse());
        Course<AssignmentCourse> assignmentCourse = new Course<>("CS 101", new AssignmentCourse());
        Course<ResearchCourse> researchCourse = new Course<>("Physics 101", new ResearchCourse());

        System.out.println(examCourse);
        System.out.println(assignmentCourse);
        System.out.println(researchCourse);

        List<CourseType> courses = List.of(new ExamCourse(), new AssignmentCourse(), new ResearchCourse());
        displayCourses(courses);
    }
}
