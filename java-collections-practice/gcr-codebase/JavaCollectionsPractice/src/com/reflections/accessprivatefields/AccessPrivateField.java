package com.reflections.accessprivatefields;
import java.lang.reflect.Field;

public class AccessPrivateField {

    public static void main(String[] args) throws Exception {

        Person person = new Person();

        Class<?> cls = person.getClass();

        Field field = cls.getDeclaredField("age");
        field.setAccessible(true); // bypass private

        field.set(person, 30); // modify value

        int value = (int) field.get(person);
        System.out.println("Age after modification: " + value);
    }
}