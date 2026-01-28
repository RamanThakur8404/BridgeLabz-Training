package com.annotations.customannotation;
public class TaskManager {

    @TaskInfo(priority = "Medium", assignedTo = "Raman")
    public void completeTask() {
        System.out.println("Task completed");
    }
}