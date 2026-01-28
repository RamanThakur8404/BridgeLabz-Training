package com.reflections.json;
import java.lang.reflect.Field;

public class JsonUtil {

    public static String toJson(Object obj) throws Exception {

        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();

        StringBuilder json = new StringBuilder("{");

        for (Field field : fields) {
            field.setAccessible(true);
            json.append("\"")
                .append(field.getName())
                .append("\":\"")
                .append(field.get(obj))
                .append("\",");
        }

        json.deleteCharAt(json.length() - 1); // remove last comma
        json.append("}");
        return json.toString();
    }
}