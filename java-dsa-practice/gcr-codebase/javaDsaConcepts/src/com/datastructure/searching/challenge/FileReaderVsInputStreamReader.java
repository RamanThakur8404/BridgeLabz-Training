package com.datastructure.searching.challenge;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class FileReaderVsInputStreamReader {
    public static void main(String[] args) throws IOException {

        String filePath = "src/com/datastructure/challenge/largefile.txt"; // 100MB text file

        // ---------- FileReader ----------
        long startFR = System.currentTimeMillis();

        FileReader fr = new FileReader(filePath);
        StringBuilder frContent = new StringBuilder();
        int ch;

        while ((ch = fr.read()) != -1) {
            frContent.append((char) ch);
        }
        fr.close();

        int frWordCount = frContent.toString().split("\\s+").length;
        long endFR = System.currentTimeMillis();

        System.out.println("FileReader Word Count : " + frWordCount);
        System.out.println("FileReader Time (ms)  : " + (endFR - startFR));


        // ---------- InputStreamReader ----------
        long startISR = System.currentTimeMillis();

        InputStreamReader isr =
                new InputStreamReader(new FileInputStream(filePath), "UTF-8");
        StringBuilder isrContent = new StringBuilder();

        while ((ch = isr.read()) != -1) {
            isrContent.append((char) ch);
        }
        isr.close();

        int isrWordCount = isrContent.toString().split("\\s+").length;
        long endISR = System.currentTimeMillis();

        System.out.println("\nInputStreamReader Word Count : " + isrWordCount);
        System.out.println("InputStreamReader Time (ms)  : " + (endISR - startISR));
    }
}
