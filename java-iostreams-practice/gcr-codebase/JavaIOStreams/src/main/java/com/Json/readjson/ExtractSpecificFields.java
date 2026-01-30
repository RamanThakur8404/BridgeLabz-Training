package com.Json.readjson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ExtractSpecificFields {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            File file = new File("src/main/java/com/Json/readjson/students.json");
            JsonNode rootNode = mapper.readTree(file);

            // 3️⃣ Loop through each object in JSON array
            for (JsonNode studentNode : rootNode) {
                String name = studentNode.get("name").asText();
                String email = studentNode.get("email").asText();

                System.out.println("Name: " + name + ", Email: " + email);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}