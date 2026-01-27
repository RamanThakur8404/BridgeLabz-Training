package com.Junit;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    MathUtils utils = new MathUtils();

    @Test
    void testDivideByZero() {
        try {
            utils.divide(10, 0);
            fail("Expected ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
            // Test passes
        }
    }
}
