package com.Json.printkeyvalues;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class PrintAllKeysValues {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // 1️⃣ Read JSON file
            File file = new File("src/main/java/com/Json/printkeyvalues/students_list.json");
            JsonNode rootNode = mapper.readTree(file);

            // 2️⃣ Print all keys and values
            printJsonNode("", rootNode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Recursive method to print keys and values
    public static void printJsonNode(String prefix, JsonNode node) {
        if (node.isObject()) {
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> field = fields.next();
                printJsonNode(prefix + field.getKey() + ".", field.getValue());
            }
        } else if (node.isArray()) {
            for (int i = 0; i < node.size(); i++) {
                printJsonNode(prefix + "[" + (i+1) + "]", node.get(i));
            }
        } else {
            // Leaf node: print key and value
            System.out.println(prefix.substring(0, prefix.length()-1) + " : " + node.asText());
        }
    }
}