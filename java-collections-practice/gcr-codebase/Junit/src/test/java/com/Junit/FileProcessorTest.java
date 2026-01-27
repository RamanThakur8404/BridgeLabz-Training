package com.Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileProcessorTest {

    FileProcessor processor;
    String filename = "testfile.txt";

    @BeforeEach
    void setUp() {
        processor = new FileProcessor();
    }

    @AfterEach
    void tearDown() {
        File file = new File(filename);
        if (file.exists()) {
            file.delete();   // cleanup after test
        }
    }

    // Test writing and reading content
    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello JUnit";

        processor.writeToFile(filename, content);
        String result = processor.readFromFile(filename);

        assertEquals(content, result);
    }

    // Test file existence
    @Test
    void testFileExistsAfterWrite() throws IOException {
        processor.writeToFile(filename, "Test Data");

        File file = new File(filename);
        assertTrue(file.exists());
    }

    // Test exception when file does not exist
    @Test
    void testReadFileNotExists() {
        assertThrows(IOException.class, () -> {
            processor.readFromFile("nofile.txt");
        });
    }
}
