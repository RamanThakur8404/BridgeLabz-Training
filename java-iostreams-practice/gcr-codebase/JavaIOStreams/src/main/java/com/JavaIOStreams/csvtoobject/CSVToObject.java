package com.JavaIOStreams.csvtoobject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVToObject {
    public static void main(String[] args) {
        String file = "src/main/java/com/JavaIOStreams/readcsv/student.csv";
        String line;
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                Student s = new Student(
                        Integer.parseInt(data[0]),
                        data[1],
                        Integer.parseInt(data[2]),
                        Integer.parseInt(data[3])
                );

                students.add(s);
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }
}