package com.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class DateFormatterTest {

    // Create an instance of DateFormatter
    DateFormatter f = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("25-01-2026", f.formatDate("2026-01-25"));
    }

    @Test
    void testInvalidDateFormat() {

        Executable executable = new Executable() {
            @Override
            public void execute() {
                f.formatDate("25-01-2026");
            }
        };

        assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    void testInvalidDateValue() {

        Executable executable = new Executable() {
            @Override
            public void execute() {
                f.formatDate("2026-02-30");
            }
        };

        assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    void testNullDate() {

        Executable executable = new Executable() {
            @Override
            public void execute() {
                f.formatDate(null);
            }
        };

        assertThrows(IllegalArgumentException.class, executable);
    }
}
