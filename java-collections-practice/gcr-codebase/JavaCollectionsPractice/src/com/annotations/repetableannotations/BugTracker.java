package com.annotations.repetableannotations;
public class BugTracker {

    @BugReport(description = "Null pointer issue")
    @BugReport(description = "Performance issue")
    public void process() {
        System.out.println("Processing task");
    }
}