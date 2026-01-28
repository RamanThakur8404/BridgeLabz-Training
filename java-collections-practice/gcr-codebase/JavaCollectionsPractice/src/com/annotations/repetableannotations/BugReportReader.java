package com.annotations.repetableannotations;
import java.lang.reflect.Method;

public class BugReportReader {

    public static void main(String[] args) throws Exception {

        Method method = BugTracker.class.getMethod("process");

        BugReport[] reports = method.getAnnotationsByType(BugReport.class);

        for (BugReport report : reports) {
            System.out.println("Bug: " + report.description());
        }
    }
}