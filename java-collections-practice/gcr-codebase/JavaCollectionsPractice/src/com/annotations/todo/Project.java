package com.annotations.todo;
public class Project {

    @Todo(task = "Implement login", assignedTo = "Aman", priority = "HIGH")
    public void login() {}

    @Todo(task = "Add logging", assignedTo = "Yashraj")
    public void logging() {}
}