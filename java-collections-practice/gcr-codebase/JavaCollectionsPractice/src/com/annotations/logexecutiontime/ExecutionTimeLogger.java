package com.annotations.logexecutiontime;
import java.lang.reflect.Method;

public class ExecutionTimeLogger {

    public static void main(String[] args) throws Exception {

        TaskService service = new TaskService();

        for (Method m : TaskService.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                m.invoke(service);
                long end = System.nanoTime();

                System.out.println(
                    m.getName() + " took " + (end - start) + " ns"
                );
            }
        }
    }
}