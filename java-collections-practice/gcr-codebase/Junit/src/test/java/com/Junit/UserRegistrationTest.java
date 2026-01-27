package com.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class UserRegistrationTest {

    // Create an instance of UserRegistration
    UserRegistration r = new UserRegistration();

    @Test
    void testValidRegistration() {
        assertTrue(r.registerUser("utkarsh", "utkarsh@gmail.com", "Pass123"));
    }

    @Test
    void testInvalidUsername() {

        Executable executable = new Executable() {
            @Override
            public void execute() {
                r.registerUser("", "a@gmail.com", "Pass123");
            }
        };

        assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    void testInvalidEmail() {

        Executable executable = new Executable() {
            @Override
            public void execute() {
                r.registerUser("user", "invalidemail", "Pass123");
            }
        };

        assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    void testInvalidPassword() {

        Executable executable = new Executable() {
            @Override
            public void execute() {
                r.registerUser("user", "a@gmail.com", "123");
            }
        };

        assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    void testNullValues() {

        Executable executable = new Executable() {
            @Override
            public void execute() {
                r.registerUser(null, null, null);
            }
        };

        assertThrows(IllegalArgumentException.class, executable);
    }
}
