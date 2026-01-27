package com.streams.filterstreams;
import java.io.*;

public class UpperToLowerCase {

    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("src/com/streams/filterstreams/input.txt"));
            bw = new BufferedWriter(new FileWriter("src/com/streams/filterstreams/output.txt"));
            int ch;
            while ((ch = br.read()) != -1) {
                bw.write(Character.toLowerCase((char) ch));
            }
            System.out.println("Conversion completed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (bw != null) bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}