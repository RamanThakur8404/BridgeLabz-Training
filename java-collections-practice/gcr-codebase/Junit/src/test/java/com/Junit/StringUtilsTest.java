package com.Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    StringUtils su = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("dcba", su.reverse("abcd"));
    }

    @Test
    void testIsPalindromeTrue() {
        assertTrue(su.isPalindrome("madam"));
    }

    @Test
    void testIsPalindromeFalse() {
        assertFalse(su.isPalindrome("java"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", su.toUpperCase("hello"));
    }
}
