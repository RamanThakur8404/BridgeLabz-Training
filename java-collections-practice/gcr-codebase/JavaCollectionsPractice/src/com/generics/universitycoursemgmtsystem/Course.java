package com.generics.universitycoursemgmtsystem;
import java.util.List;
class Course<T extends CourseType> {
    private String courseName;
    private T courseType;

    // Constructor to initialize the course with name and type
    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    // Getter for course name
    public String getCourseName() {
        return courseName;
    }

    // Getter for course evaluation method
    public String getCourseEvaluationMethod() {
        return courseType.getEvaluationMethod();
    }

    @Override
    public String toString() {
        return "Course Name: " + courseName + ", Evaluation: " + courseType.getEvaluationMethod();
    }
}
