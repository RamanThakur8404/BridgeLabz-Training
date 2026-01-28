package com.reflections.classinfo;
import java.lang.reflect.*;

public class ClassInfoDemo {

    public static void main(String[] args) throws Exception {

        // Example input: java.util.ArrayList
        String className = "java.util.ArrayList";

        Class<?> cls = Class.forName(className);

        System.out.println("Class Name: " + cls.getName());

        System.out.println("\n--- Constructors ---");
        Constructor<?>[] constructors = cls.getDeclaredConstructors();
        for (Constructor<?> c : constructors) {
            System.out.println(c);
        }

        System.out.println("\n--- Fields ---");
        Field[] fields = cls.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f);
        }

        System.out.println("\n--- Methods ---");
        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
    }
}