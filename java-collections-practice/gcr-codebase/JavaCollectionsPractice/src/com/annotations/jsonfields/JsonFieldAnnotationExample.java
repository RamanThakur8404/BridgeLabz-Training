package com.annotations.jsonfields;

import java.lang.reflect.Field;

public class JsonFieldAnnotationExample {

    public static String toJson(Object obj) throws Exception {

        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();

        StringBuilder json = new StringBuilder("{");
        boolean first = true;

        for (Field field : fields) {

            if (field.isAnnotationPresent(JsonField.class)) {

                field.setAccessible(true);
                JsonField jf = field.getAnnotation(JsonField.class);

                if (!first) json.append(", ");

                json.append("\"")
                    .append(jf.name())
                    .append("\": ");

                Object value = field.get(obj);

                if (value instanceof String)
                    json.append("\"").append(value).append("\"");
                else
                    json.append(value);

                first = false;
            }
        }

        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws Exception {

        DataModel data = new DataModel("Raman", 105, "hidden");
        System.out.println(toJson(data));
    }
}