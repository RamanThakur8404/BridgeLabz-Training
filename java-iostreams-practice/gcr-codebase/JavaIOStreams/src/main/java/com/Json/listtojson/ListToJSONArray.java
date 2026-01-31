package com.Json.listtojson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToJSONArray {
    public static void main(String[] args) {
        try {
            // 1️⃣ Create a list of Student objects
            List<Student> students = new ArrayList<>();
            students.add(new Student("Raman Thakur", 21, "raman@example.com", Arrays.asList("Math", "Physics")));
            students.add(new Student("Amit Verma", 22, "amit@example.com", Arrays.asList("Biology", "Chemistry")));
            students.add(new Student("Rahul kumar", 23, "rahul@example.com", Arrays.asList("History", "Geography")));

            // 2️⃣ Create ObjectMapper
            ObjectMapper mapper = new ObjectMapper();

            // 3️⃣ Convert list to JSON array (pretty printed)
            String jsonArray = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(students);

            // 4️⃣ Print JSON array
            System.out.println(jsonArray);

            // 5️⃣ Save JSON array to file
            File file = new File("src/main/java/com/Json/listtojson/students_list.json");
            mapper.writerWithDefaultPrettyPrinter().writeValue(file, students);

            System.out.println("JSON array saved to students_list.json");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}