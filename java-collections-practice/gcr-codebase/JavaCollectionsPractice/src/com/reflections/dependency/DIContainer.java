package com.reflections.dependency;
import java.lang.reflect.Field;

public class DIContainer {

    public static <T> T createObject(Class<T> clazz) throws Exception {

        T obj = clazz.getDeclaredConstructor().newInstance();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                Object dependency =
                    field.getType().getDeclaredConstructor().newInstance();
                field.set(obj, dependency);
            }
        }
        return obj;
    }
}