package com.annotations.importantmethod;
import java.lang.reflect.Method;

public class ImportantMethodReader {

    public static void main(String[] args) {

        for (Method m : Service.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = m.getAnnotation(ImportantMethod.class);
                System.out.println(m.getName() + " | Level: " + im.level());
            }
        }
    }
}