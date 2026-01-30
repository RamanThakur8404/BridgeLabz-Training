package com.JavaIOStreams.filtercsv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterStudentCSV {
    public static void main(String[] args) {
        String file = "src/main/java/com/JavaIOStreams/readcsv/student.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int marks = Integer.parseInt(data[3]);

                if (marks > 80) {
                    System.out.println(
                        "ID: " + data[0] +
                        ", Name: " + data[1] +
                        ", Age: " + data[2] +
                        ", Marks: " + marks
                    );
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
        }
    }
}