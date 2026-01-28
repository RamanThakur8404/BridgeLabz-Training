package com.annotations.maxlength;
import java.lang.reflect.Field;

public class User {

    @MaxLength(10)
    private String username;

    public User(String username) {
        for (Field f : this.getClass().getDeclaredFields()) {
            if (f.isAnnotationPresent(MaxLength.class)) {
                MaxLength ml = f.getAnnotation(MaxLength.class);
                if (username.length() > ml.value()) {
                    throw new IllegalArgumentException("Username too long");
                }
            }
        }
        this.username = username;
    }

	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}
}