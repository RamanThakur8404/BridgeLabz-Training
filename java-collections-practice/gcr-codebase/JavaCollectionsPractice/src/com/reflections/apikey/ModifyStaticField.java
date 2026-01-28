package com.reflections.apikey;
import java.lang.reflect.Field;

public class ModifyStaticField {

    public static void main(String[] args) throws Exception {

        Class<?> cls = Configuration.class;

        Field field = cls.getDeclaredField("API_KEY");
        field.setAccessible(true);

        // Modify static field (null object reference)
        field.set(null, "NEW_SECRET_KEY");

        Configuration.showKey();
    }
}