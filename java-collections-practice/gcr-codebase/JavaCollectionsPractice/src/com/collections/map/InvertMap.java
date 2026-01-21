package com.collections.map;

import java.util.ArrayList;
import java.util.HashMap;

public class InvertMap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        HashMap<Integer, ArrayList<String>> inverted = new HashMap<>();

        // loop through original map
        for (String key : map.keySet()) {
            int value = map.get(key);

            // create list if value not present
            if (!inverted.containsKey(value))
                inverted.put(value, new ArrayList<>());

            // add key to list
            inverted.get(value).add(key);
        }

        System.out.println(inverted);
    }
}