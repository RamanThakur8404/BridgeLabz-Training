package com.reflections.json;
import com.reflections.map.ObjectMapperUtil;
import com.reflections.map.User;
public class JsonTest {

    public static void main(String[] args) throws Exception {

        User user = new User();
        ObjectMapperUtil.toObject(
            User.class,
            java.util.Map.of("name", "Aman", "age", 25)
        );

        System.out.println(JsonUtil.toJson(user));
    }
}