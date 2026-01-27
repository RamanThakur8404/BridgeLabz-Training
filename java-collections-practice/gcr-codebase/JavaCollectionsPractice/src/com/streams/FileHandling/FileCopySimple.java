package com.streams.FileHandling;
import java.io.*;

public class FileCopySimple {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("src/com/streams/FileHandling/source.txt");
            FileOutputStream fos = new FileOutputStream("src/com/streams/FileHandling/output.txt");

            int ch;
            while ((ch = fis.read()) != -1) {
                fos.write(ch);
            }

            fis.close();
            fos.close();

            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Source file does not exist.");

        } catch (IOException e) {
            System.out.println("Error while reading or writing file.");
        }
    }
}
