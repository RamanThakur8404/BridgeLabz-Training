package com.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// Test class for TemperatureConverter
public class TemperatureConverterTest {

    // Create an instance of TemperatureConverter
    TemperatureConverter t = new TemperatureConverter();

    @Test
    void testCtoF() {
        assertEquals(32, t.celsiusToFahrenheit(0), 0.001);
        assertEquals(212, t.celsiusToFahrenheit(100), 0.001);
    }

    @Test
    void testFtoC() {
        assertEquals(0, t.fahrenheitToCelsius(32), 0.001);
        assertEquals(100, t.fahrenheitToCelsius(212), 0.001);
    }
}
