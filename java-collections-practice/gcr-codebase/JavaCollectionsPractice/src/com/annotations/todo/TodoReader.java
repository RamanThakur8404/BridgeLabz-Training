package com.annotations.todo;
import java.lang.reflect.Method;

public class TodoReader {

    public static void main(String[] args) {

        for (Method m : Project.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo t = m.getAnnotation(Todo.class);
                System.out.println(
                    m.getName() + " | " + t.task() + 
                    " | Assigned: " + t.assignedTo() +
                    " | Priority: " + t.priority()
                );
            }
        }
    }
}